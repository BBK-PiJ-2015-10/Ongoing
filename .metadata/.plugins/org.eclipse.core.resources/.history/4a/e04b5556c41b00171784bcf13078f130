package com.plantplaces.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import java.util.List;
import java.util.ArrayList;

import com.plantplaces.dto.Plant;
import com.plantplaces.service.IPlantService;

@Named
@ManagedBean
@Scope("session")
public class SearchPlants {

	@Inject
	private Plant plant;
	
	@Inject
	private IPlantService plantService;
	
	public String execute(){
		if (plant != null && plant.getName().equalsIgnoreCase("Redbud")){
			return "search";
		} else {
			return "noresults";
		}
	}
	
	public List<Plant> completePlants(String query){
		return plantService.filterPlants(query);
	}
	

	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
	}
	
	
	
}
