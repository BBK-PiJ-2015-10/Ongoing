package com.plantplaces.ui.test;

import org.junit.Test;

import com.plantplaces.dto.Plant;
import com.plantplaces.ui.SearchPlants;

import junit.framework.TestCase;

public class TestSearchPlants extends TestCase {
	
	private SearchPlants searchPlants;
	
	private String execute;

	@Test
	public void testSearchPlantsExecute(){
		givenSearchPlantsCreatedWithRedbud();
		whenInvokeExecute();
		thenVerifyReturnSearch();
	}
	
	@Test
	public void testSearchPlantsNoRedbud(){
		givenSearchPlantCreatedWithoutRedbud();
		whenInvokeExecute();
		thenVerifyReturnNoResults();
	}
	
	@Test
	public void testSearchPlantsNull(){
		givenSearchPlantCreatedWithNull();
		whenInvokeExecute();
		thenVerifyReturnNoResults();
	}
	
	

	private void givenSearchPlantCreatedWithNull() {
		searchPlants = new SearchPlants();
		searchPlants.setPlant(null);
		
	}

	private void thenVerifyReturnNoResults() {
		assertEquals("noresults",execute);
	}

	private void givenSearchPlantCreatedWithoutRedbud() {
		searchPlants = new SearchPlants();
		Plant plant = new Plant();
		plant.setName("Pawpaw");
		searchPlants.setPlant(plant);
	}

	private void whenInvokeExecute() {
		execute = searchPlants.execute();
		
	}

	private void thenVerifyReturnSearch() {
		assertEquals("search",execute);
		
	}

	private void givenSearchPlantsCreatedWithRedbud() {
		searchPlants = new SearchPlants();
		Plant plant = new Plant();
		plant.setName("Redbud");
		searchPlants.setPlant(plant);
	}
	
	

}
