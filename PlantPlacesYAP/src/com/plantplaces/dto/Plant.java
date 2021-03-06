package com.plantplaces.dto;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.context.annotation.Scope;



@Named
@ManagedBean
@Scope("session")
@Entity
@Table(name="plants")
public class Plant implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PLANT_ID;

	@Transient
	private String name;
	
	@Column(name="GENUS",nullable=false)
	private String genus;
	
	@Column(name="SPECIES",nullable=false)
	private String species;
	
	@Column(name="CULTIVAR",nullable=false)
	private String cultivar;
	
	@Column(name="COMMON",nullable=false)
	private String common;
	
	@Transient
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
