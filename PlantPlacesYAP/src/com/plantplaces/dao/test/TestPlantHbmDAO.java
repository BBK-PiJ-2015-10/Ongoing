package com.plantplaces.dao.test;

import java.util.List;

import org.junit.Test;

import com.plantplaces.dao.IPlantDAO;
import com.plantplaces.dao.PlantHbmDAO;
import com.plantplaces.dto.Plant;

import junit.framework.TestCase;

public class TestPlantHbmDAO extends TestCase {
	
	private IPlantDAO plantHbmDAO;
	
	private List<Plant> plants;

	@Test
	public void testFetchByCommonName(){
		givenPlantDAOInstantiated();
		whenCommonNameisRedbud();
		thenVerifyResults();
	}

	private void thenVerifyResults() {
		
		assertTrue(plants.size() > 0);
		for (Plant plant: plants){
			assertEquals(plant.getCommon(),"adasa");
		}
		
	}

	private void whenCommonNameisRedbud() {
		Plant p = new Plant();
		p.setCommon("adasa");
		plants = plantHbmDAO.fetchPlants(p);
		
	}

	private void givenPlantDAOInstantiated() {
		plantHbmDAO = new PlantHbmDAO();
	}

}
