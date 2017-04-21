package com.plantplaces.service;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;

import com.plantplaces.dao.IFileDAO;
import com.plantplaces.dao.IPhotoDAO;
import com.plantplaces.dao.IPlantDAO;
import com.plantplaces.dto.Photo;
import com.plantplaces.dto.Plant;
import com.plantplaces.dto.Specimen;
import com.plantplaces.dao.ISpecimenDAO;


@Named
public class PlantService implements IPlantService {

	@Inject
	private IPlantDAO plantDAO;
	
	@Inject
	private ISpecimenDAO specimenDAO;
	
	@Inject
	private IFileDAO fileDAO;
	
	@Inject
	private IPhotoDAO photoDAO;
	
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
		plantDAO.save(plant);	
	}
	
	@Override
	public void save(Specimen specimen) throws Exception {
		specimenDAO.save(specimen);
	}
	
	
	@Override
	public void loadSpecimens(Plant plant) {
		List<Specimen> specimens = specimenDAO.fetchByPlantId(plant.getPLANT_ID());
		plant.setSpecimens(specimens);
	}
	
	
	
	/**
	 * Return a list of plants that match the given search criteria
	 * @param plant a parameter that contains the search criteria
	 * @return a list of matching plants
	 */
	@Override
	public List<Plant> fetchPlants(Plant plant){
		List<Plant> plants = plantDAO.fetchPlants(plant);
		return plants;
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


	@Override
	public void savePhoto(Photo photo, InputStream inputStream) throws Exception {
		//String dirAddress =".\\WebContent\\images";
		//String dirAddress = "C:/Users/YasserAlejandro/SDP/Ongoing/PlantPlacesYAP/WebContent/images";
		String dirAddress = "/Users/YasserAlejandro/SDP/Ongoing/PlantPlacesYAP/WebContent/images";
		File directory = new File(dirAddress);
		String uniqueImageName = getUniqueImageName();
		File file = new File(directory,uniqueImageName);
		fileDAO.save(inputStream, file);
		
		photo.setUri(uniqueImageName.toString());
		//eventually save the photo to the database.
		photoDAO.save(photo);
		
	}


	private String getUniqueImageName() {
		String imagePrefix = "plantPlaces";
		String imageSuffix = "jpg.";
		String middle;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
		middle = sdf.format(new Date());
		
		return imagePrefix+middle+imageSuffix;
	}


	
	
	

}
