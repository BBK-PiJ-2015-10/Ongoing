package com.plantplaces.dto;

import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

import org.springframework.context.annotation.Scope;

@Named
@ManagedBean
@Scope("session")
@Entity
@Table(name="specimens")
public class Specimen {
	
	@Id
	@Column(name="SPECIMEN_ID",nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int specimenid;
	
	@Column(name="PLANT_ID",nullable=false)
	private int plantId;
	
	@Column(name="LATITUDE",nullable=true)
	private String latitude;
	
	@Column(name="LONGITUDE",nullable=true)
	private String longitude;
	
	@Column(name="PLANTED_BY",nullable=true)
	private String plantedBy;
	
	@Column(name="PLANTED_DATE",nullable=true)
	private String plantedDate;

	@Column(name="DESCRIPTION",nullable=true)
	private String description;

	public int getSpecimenid() {
		return specimenid;
	}

	public void setSpecimenid(int specimenid) {
		this.specimenid = specimenid;
	}

	public int getPlantId() {
		return plantId;
	}

	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}

	public String getPlantedBy() {
		return plantedBy;
	}

	public void setPlantedBy(String plantedBy) {
		this.plantedBy = plantedBy;
	}

	public String getPlantedDate() {
		return plantedDate;
	}

	public void setPlantedDate(String plantedDate) {
		this.plantedDate = plantedDate;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	


	
	

}
