package com.plantplaces.dao;

import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.plantplaces.dto.Plant;

public interface IPlantDAO {

	List<Plant> fetchPlants();
	
	void insert(Plant plant) throws Exception;
	
	void update(Plant plant) throws Exception;
	
	void delete(Plant plant) throws Exception;

	List<Plant> fetchPlants(Plant plant);
	
}
