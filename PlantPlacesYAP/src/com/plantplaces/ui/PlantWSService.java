package com.plantplaces.ui;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.plantplaces.dto.Plant;
import com.plantplaces.service.IPlantService;

@WebService
@Named
public class PlantWSService implements IPlantWSService {
	
	/* 
	 * For further learning on how to use SoapUI go to
	 * http://www.soapui.org/About-SoapUI/features.html
	 */
	
	
	@Inject
	private IPlantService plantService;
	
	public PlantWSService(){
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
	
	/* (non-Javadoc)
	 * @see com.plantplaces.ui.IPlantWSService#fetchPlants(java.lang.String)
	 */
	@Override
	@WebMethod
	public String fetchPlants(String plantName){
		String returnValue = "No plants match your search";
		
		Plant searchPlant = new Plant();
		searchPlant.setCommon(plantName);
		
		List<Plant> plants = getPlantService().fetchPlants(searchPlant);
		
		for (Plant plant : plants) {
			returnValue=plant.toString();
		}
		
		return returnValue;
	}

	public IPlantService getPlantService() {
		return plantService;
	}

	public void setPlantService(IPlantService plantService) {
		this.plantService = plantService;
	}

}
