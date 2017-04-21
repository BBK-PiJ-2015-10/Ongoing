package com.plantplaces.dao;

import java.util.Collections;
import java.util.List;

import javax.inject.Named;

import org.hibernate.Query;
import org.hibernate.Session;

import com.plantplaces.dto.Specimen;

@Named
public class SpecimenHbmDAO extends PlantPlacesHbmDAO<Specimen> implements ISpecimenDAO {

	
	@Override
	public List<Specimen> fetchByPlantId(int plantId){
		Session session = HibernateUtil.getSessionFactory().openSession();
		//You don't use the table name but the DTO name
		Query query = session.createQuery("from Specimen where plantId = :plantId");
		query.setParameter("plantId",plantId);
		@SuppressWarnings("rawtypes")
		List list = query.list();
		List<Specimen> specimens = Collections.checkedList(list,Specimen.class);
		return specimens;
	}	


	@Override
	public void insert(Session session, Specimen dto) throws Exception {
		session.save(dto);
	}


	
}
