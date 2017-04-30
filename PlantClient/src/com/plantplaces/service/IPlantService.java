package com.plantplaces.service;

import java.io.InputStream;
import java.util.List;

import com.plantplaces.dto.Photo;
import com.plantplaces.dto.Plant;
import com.plantplaces.dto.Specimen;

public interface IPlantService {
	
	/**
	 * Return a collection of Plant objects that contains the given filter text.
	 * @param filter a substring that should be contained in return plants.
	 * @return a collection of matching plants.
	 */
	List<Plant> filterPlants(String filter);
	
	/**
	 * Save the plant and performs a validation check.
	 * @param plant the plant we are persisting.
	 * @throws Exception if unable to save.
	 */

	void save(Plant plant) throws Exception;

	List<Plant> fetchPlants(Plant plant);

	void save(Specimen specimen) throws Exception;
	
	
	
	/**
	 * Load specimens for a given plant
	 * @param plant
	 */
	void loadSpecimens(Plant plant);

	void savePhoto(Photo photo, InputStream inputStream) throws Exception;

	List<Photo> fetchPhotos(Specimen specimen);

}
