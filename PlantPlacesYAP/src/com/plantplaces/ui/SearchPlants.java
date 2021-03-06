package com.plantplaces.ui;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;

// import javax.annotation.ManagedBean;

import org.springframework.context.annotation.Scope;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import com.plantplaces.dto.Plant;
import com.plantplaces.service.IPlantService;

@Named
@ManagedBean
@Scope("session")
public class SearchPlants {

	final static Logger logger = Logger.getLogger(SearchPlants.class);
	
	@Inject
	private Plant plant;
	
	@Inject
	private IPlantService plantService;

	private List<Plant> plants;
	
	private Plant selectedPlant;
	
	@Inject
	private SpecimenVO specimenVO;
	
	public String execute(){
		
		setPlants(plantService.fetchPlants(plant));
		
		if (plants.size()>0){
			return "search";
		}
		else {
			return "noresults";
		}
		
		
	}
	

	public List<Plant> completePlants(String query){
		return plantService.filterPlants(query);
	}
	
	public void onRowSelect(SelectEvent event){
		Plant plant = ((Plant)event.getObject());		
		specimenVO.setPlant(plant);
		//The below allows you to redirect to a different page
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("specimen.xhtml");
		} catch (IOException e) {
			// TODo
			e.printStackTrace();
		}
	}
		

	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
	}


	public List<Plant> getPlants() {
		return plants;
	}


	public void setPlants(List<Plant> plants) {
		this.plants = plants;
	}

	
	public Plant getSelectedPlant() {
		return selectedPlant;
	}


	public void setSelectedPlant(Plant selectedPlant) {
		this.selectedPlant = selectedPlant;
	}
	
	
	
}
