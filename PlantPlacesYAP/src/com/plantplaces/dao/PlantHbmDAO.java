package com.plantplaces.dao;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.inject.Named;

import com.plantplaces.dto.Plant;

//@Named("plantDAO")
public class PlantHbmDAO implements IPlantDAO {

	@Override
	public List<Plant> fetchPlants() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		//Plant refers to the class not the table HQL syntax not SQL
		Query query = session.createQuery("from Plant");
		@SuppressWarnings("rawtypes")
		List list = query.list();
		List<Plant> plants = Collections.checkedList(list,Plant.class);
		return plants;
	}
	
	@Override
	public List<Plant> fetchPlants(Plant plant){
		Session session = HibernateUtil.getSessionFactory().openSession();
		//Plant refers to the class not the table HQL syntax not SQL
		Query query = session.createQuery("from Plant where common like :common");
		query.setParameter("common","%"+plant.getCommon()+"%");
		//query.setProperties(plant);
		@SuppressWarnings("rawtypes")
		List list = query.list();
		List<Plant> plants = Collections.checkedList(list,Plant.class);
		return plants;
	}
	

	@Override
	public void insert(Plant plant) throws Exception {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
			
		System.out.println("I am about to save: " +plant);
		
		session.beginTransaction();
		session.save(plant);
		session.getTransaction().commit();
		
		session.close();
		
	}

	@Override
	public void update(Plant plant) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Plant plant) throws Exception {
		// TODO Auto-generated method stub

	}

}
