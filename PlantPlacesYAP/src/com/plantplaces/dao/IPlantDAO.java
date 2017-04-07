package com.plantplaces.dao;

import java.util.List;

import com.plantplaces.dto.Plant;

public interface IPlantDAO {

	List<Plant> fetchPlants();
	
	void insert(Plant plant) throws Exception;
	
	void update(Plant plant) throws Exception;
	
	void delete(Plant plant) throws Exception;
	
}
