package com.plantplaces.service;

import java.util.List;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Named;

import com.plantplaces.dao.IPlantDAO;
import com.plantplaces.dto.Plant;

@Named
public class PlantService implements IPlantService {

	@Inject
	IPlantDAO plantDAO;
	
	private List<Plant> allPlants;
	
	@Override
	public List<Plant> filterPlants(String filter) {
		if (allPlants==null){
			allPlants = plantDAO.fetchPlants();
		}
		List<Plant> returnPlants = new ArrayList();
		for (Plant plant: allPlants){
			if(plant.toString().contains(filter)){
				returnPlants.add(plant);
			}
		}
		return returnPlants;
	}
	
	
	public void save(Plant plant) throws Exception{
		if(plant.getGenus() == null || plant.getGenus().isEmpty() ){
			throw new Exception("Genus required");
		}
		plantDAO.insert(plant);
		
	}

	public IPlantDAO getPlantDAO() {
		return plantDAO;
	}

	public void setPlantDAO(IPlantDAO plantDAO) {
		this.plantDAO = plantDAO;
	}

	public List<Plant> getAllPlants() {
		return allPlants;
	}

	public void setAllPlants(List<Plant> allPlants) {
		this.allPlants = allPlants;
	}
	
	

}
