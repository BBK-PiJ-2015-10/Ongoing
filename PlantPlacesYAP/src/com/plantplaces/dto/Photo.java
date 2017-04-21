package com.plantplaces.dto;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

@Named
@ManagedBean
@Scope("session")
@Entity
@Table(name="photos")
public class Photo {
	
	@Id
	@Column(name="PHOTO_ID",nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="SPECIMEN_ID",nullable=true)
	private int specimenId;
	
	@Column(name="URI",nullable=true)
	private String uri;
	
	@Column(name="DATE_TAKEN",nullable=true)
	private Date dateTaken;
	
	@Column(name="CONTRIBUTOR",nullable=true)
	private String contributor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSpecimenId() {
		return specimenId;
	}

	public void setSpecimenId(int specimenId) {
		this.specimenId = specimenId;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Date getDateTaken() {
		return dateTaken;
	}

	public void setDateTaken(Date dateTaken) {
		this.dateTaken = dateTaken;
	}

	public String getContributor() {
		return contributor;
	}

	public void setContributor(String contributor) {
		this.contributor = contributor;
	}
	
	@Override
	public String toString() {
		return uri;
	}
	
	

}
