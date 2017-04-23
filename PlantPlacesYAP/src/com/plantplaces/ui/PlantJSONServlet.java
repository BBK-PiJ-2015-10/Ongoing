package com.plantplaces.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.plantplaces.dto.Plant;
import com.plantplaces.service.IPlantService;

@Named
public class PlantJSONServlet extends HttpServlet {

	//jsonviewer.stack.hu
	
	@Inject
	IPlantService plantService;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		//This sets up our dependency injection for Spring and this class.
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,config.getServletContext());
	}
	

	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//This is to be able to search by parameter passed on the http
		String filter = req.getParameter("filter");
		
		//our search criteria
			Plant searchPlant = new Plant();
		
		if (filter!=null && !filter.isEmpty()){
			searchPlant.setCommon(filter);
		} else{
			searchPlant.setCommon("e");
		}
		
		
		
		// get a list of plants that match the result
		List<Plant> plants = plantService.fetchPlants(searchPlant);
		
		//start writing a stream of data
		resp.setContentType("application/json");
		PrintWriter writer = resp.getWriter();
		
		//start building  json tree
		JsonObjectBuilder rootBuilder = Json.createObjectBuilder();
		
		JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
		
		for (Plant plant : plants) {
			//Create a Json for each plant, the plants will have the same name but different values
			JsonObjectBuilder plantBuilder = Json.createObjectBuilder();
			JsonObject plantJson = plantBuilder.add("genus",plant.getGenus() !=null ? plant.getGenus() : "")
			.add("species",plant.getSpecies() !=null ? plant.getSpecies() : "")
			.add("common",plant.getCommon() !=null ? plant.getCommon() : "")
			.add("cultivar",plant.getCultivar() !=null ? plant.getCultivar() : "")
			.build();
			
			//add plants to array 
			arrayBuilder.add(plantJson);
		}
		
		//add the array of plants to a root json object
		JsonObject root = rootBuilder.add("plants",arrayBuilder).build();
		
		//write the json to the servlet 
		writer.print(root);
		writer.flush();
		writer.close();
		
	}
	
	
	
	
}
