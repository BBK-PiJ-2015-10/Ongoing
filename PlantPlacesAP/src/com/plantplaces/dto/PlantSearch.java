package com.plantplaces.dto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.inject.Named;

//@Named
@SessionScoped
@ManagedBean
public class PlantSearch {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}