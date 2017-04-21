package com.plantplaces.dao;

import org.hibernate.Session;

import com.plantplaces.dto.Photo;

public interface IPhotoDAO {

	void insert(Session session, Photo dto) throws Exception;
	
	void save(Photo dto) throws Exception;

}