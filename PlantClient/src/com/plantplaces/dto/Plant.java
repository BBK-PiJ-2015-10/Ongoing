package com.plantplaces.dto;

import java.io.Serializable;
import java.util.List;


import org.springframework.stereotype.Component;

@Component
public class Plant implements Serializable {

	
	private int PLANT_ID;

	private String name;
	
	private String genus;
	
	private String species;
	
	private String cultivar;
	
	private String common;
	
	private List<Specimen> specimens;

	
	public int getPLANT_ID() {
		return PLANT_ID;
	}

	public void setPLANT_ID(int PLANT_ID) {
		this.PLANT_ID = PLANT_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getCultivar() {
		return cultivar;
	}

	public void setCultivar(String cultivar) {
		this.cultivar = cultivar;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	@Override
	public String toString(){
		return genus + " " +species + " " +cultivar +" " +common;
	}

	
	public List<Specimen> getSpecimens() {
		return specimens;
	}

	public void setSpecimens(List<Specimen> specimens) {
		this.specimens = specimens;
	}
	
	
	
}
