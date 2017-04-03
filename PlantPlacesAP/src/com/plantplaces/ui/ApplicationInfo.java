package com.plantplaces.ui;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class ApplicationInfo {
	
	private String slogan = "Promoting Plant Diversity through Education all the time.";

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	
	
			
			

}
