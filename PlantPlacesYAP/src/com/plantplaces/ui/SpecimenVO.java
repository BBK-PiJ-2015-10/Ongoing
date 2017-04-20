package com.plantplaces.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.plantplaces.dto.Plant;
import com.plantplaces.dto.Specimen;
import com.plantplaces.service.IPlantService;

@Named
@ManagedBean
@Scope("session")
public class SpecimenVO {
	
	private Plant plant;
	
	@Inject
	private Specimen specimen;
	
	@Inject
	private IPlantService plantService;

	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
		loadSpecimens();
	}

	
	private void loadSpecimens() {
		plantService.loadSpecimens(plant);
	}
	

	public Specimen getSpecimen() {
		return specimen;
	}

	public void setSpecimen(Specimen specimen) {
		this.specimen = specimen;
	}
	
	
	 
	public String save(){
		// Set the foreign key to plantID before saving
		specimen.setPlantId(plant.getPLANT_ID());

		try {
			plantService.save(specimen);
			return"specimensaved";
		} catch (Exception e) {
			// Will add a growl here
			e.printStackTrace();
			return "failed";
		}
	}
	
	
	
	

}