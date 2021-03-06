package com.plantplaces.service.test;

import org.junit.Test;
import junit.framework.TestCase;

import static org.mockito.Mockito.*;

import com.plantplaces.dao.IPlantDAO;
import com.plantplaces.dto.Plant;
import com.plantplaces.service.PlantService;

import java.util.ArrayList;
import java.util.List;


public class TestPlantService extends TestCase {

	
	private PlantService plantService;
	
	private List<Plant> filterPlants;

	private IPlantDAO plantDAO;
	
	@Test
	public void testFilterPlants(){
		givenThatPlantServiceIsPopulatedWithPlantDAO();
		whenFilterWithRed();
		thenVerifyTwoResults();
	}

	private void thenVerifyTwoResults() {	
		assertEquals(2,filterPlants.size());
	}

	private void whenFilterWithRed() {
		filterPlants = plantService.filterPlants("Red");
		verify(plantDAO,times(1)).fetchPlants();
	}
	
	private List<Plant> constructPlantList(){
		List<Plant> allPlants = new ArrayList();
		
		Plant redbud = new Plant();
		redbud.setName("Eastern Redbud");
		redbud.setGenus("Cercis");
		redbud.setSpecies("canadensis");
		redbud.setCommon("Redbubd");
		
		allPlants.add(redbud);
		Plant pawpaw = new Plant();
		pawpaw.setCommon("Paw Paw");
		pawpaw.setGenus("Asimina");
		pawpaw.setSpecies("triloba");
		allPlants.add(pawpaw);

		Plant nasturtium = new Plant();
		nasturtium.setCommon("nasturtium");
		nasturtium.setGenus("Trapoleanum");
		nasturtium.setSpecies("spp.");
		allPlants.add(nasturtium);
		
		Plant redMaple = new Plant();
		redMaple.setGenus("Acer");
		redMaple.setSpecies("rubrum");
		redMaple.setCommon("Red Maple");
		allPlants.add(redMaple);		
		return allPlants;	
	}

	private void givenThatPlantServiceIsPopulatedWithPlantDAO() {
		plantService = new PlantService();
		plantDAO = mock(IPlantDAO.class);
		when(plantDAO.fetchPlants()).thenReturn(constructPlantList());
		plantService.setPlantDAO(plantDAO);
	}
	

	
}
