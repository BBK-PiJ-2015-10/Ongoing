package com.plantplaces.ui;

import java.io.IOException;
import java.io.InputStream;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;
import org.primefaces.model.UploadedFile;
import org.springframework.context.annotation.Scope;

import com.plantplaces.dto.Photo;
import com.plantplaces.dto.Plant;
import com.plantplaces.dto.Specimen;
import com.plantplaces.service.IPlantService;

@Named
@ManagedBean
@Scope("session")
public class SpecimenVO {
	
	private Plant plant;
	
	@Inject
	private Specimen specimen;
	
	@Inject
	private IPlantService plantService;
	
	private UploadedFile file;

	@Inject
	private Photo photo;

	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
		loadSpecimens();
	}

	
	private void loadSpecimens() {
		plantService.loadSpecimens(plant);
	}
	

	public Specimen getSpecimen() {
		return specimen;
	}

	public void setSpecimen(Specimen specimen) {
		this.specimen = specimen;
	}
	
	
	 
	public String save(){
		// Set the foreign key to plantID before saving
		specimen.setPlantId(plant.getPLANT_ID());

		try {
			plantService.save(specimen);
			return"specimensaved";
		} catch (Exception e) {
			// Will add a growl here
			e.printStackTrace();
			return "failed";
		}
	}
	
	public void onRowSelect(SelectEvent event){
		Specimen specimen = ((Specimen) event.getObject());
		setSpecimen(specimen);		
	}

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}
	
	public void upload(){
		if (specimen.getSpecimenid()==0){
			FacesMessage message = new FacesMessage("You have not yet selected a specimen. Please select one before saving the image");
			FacesContext.getCurrentInstance().addMessage(null,message);
		}
		else if (file!=null){
			try {
				InputStream inputstream = file.getInputstream();
				//setPhoto(new Photo());
				photo.setSpecimenId(specimen.getSpecimenid());
				plantService.savePhoto(getPhoto(),inputstream);
				FacesMessage message = new FacesMessage("Succesful",file.getFileName() + " is uploaded.");
				FacesContext.getCurrentInstance().addMessage(null,message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				FacesMessage message = new FacesMessage("There was a problem your file wasn't loaded");
				FacesContext.getCurrentInstance().addMessage(null,message);
			}
		}
		
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
	
	

}
