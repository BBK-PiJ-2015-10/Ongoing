package com.plantplaces.ui;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;

import com.plantplaces.dto.Plant;
import com.plantplaces.service.IPlantService;


//Request creates a new object for each http request, while session keeps using the same object.
@Named
@ManagedBean
@Scope("request")
public class AddPlant {

	final static Logger logger = Logger.getLogger(AddPlant.class);
	
	@Inject
	private Plant plant;
	
	@Inject
	private IPlantService plantService;
	
	public String execute(){
		
		logger.info("Entering the execute method");
		
		String returnValue ="success";
		
		// get faces context
		FacesContext currentInstance = FacesContext.getCurrentInstance();
		FacesMessage fm;
		
		try {
			plantService.save(plant);
			
			logger.info("Save successful " +plant.toString());
			
			//what is the message we want to show
			fm = new FacesMessage(FacesMessage.SEVERITY_INFO,"Saved","Plant Saved");
			currentInstance.addMessage(null,fm);
			
		} catch (Exception e) {
			
			logger.error("Error while saving plant. Message: " +e.getMessage());
			
			fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Unable to Save","Plant not Saved");
			currentInstance.addMessage(null,fm);
			returnValue ="fail";
		}
		return returnValue;
	}

	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
	}

	public IPlantService getPlantService() {
		return plantService;
	}

	public void setPlantService(IPlantService plantService) {
		this.plantService = plantService;
	}
	
}