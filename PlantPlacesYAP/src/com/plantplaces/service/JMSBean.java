package com.plantplaces.service;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jms.Connection;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.plantplaces.dto.Plant;

@Named
public class JMSBean {
	
	@Inject
	ActiveMQConnectionFactory jmsConnectionFactory;
	
	public void submit(String message) throws Exception {
		
		//Connecing to the queue manager set up on localhost 6161
		Connection connection = jmsConnectionFactory.createConnection();
		connection.start();
		Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
		Queue photoQueue = session.createQueue("photos");
		MessageProducer producer = session.createProducer(photoQueue);
		TextMessage textMessage = session.createTextMessage(message);
		producer.send(textMessage);
		connection.stop();
		
	}
	
	public void submit(Plant plant) throws Exception {
		
		//Connecing to the queue manager set up on localhost 6161
		Connection connection = jmsConnectionFactory.createConnection();
		connection.start();
		Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
		Queue plantsQueue = session.createQueue("plants");
		MessageProducer producer = session.createProducer(plantsQueue);
		
		JsonObjectBuilder plantBuilder = Json.createObjectBuilder();
		JsonObject plantJson = plantBuilder.add("genus",plant.getGenus() !=null ? plant.getGenus() : "")
				.add("species",plant.getSpecies() !=null ? plant.getSpecies() : "")
				.add("cultivar",plant.getCultivar() !=null ? plant.getCultivar() : "")
				.add("common",plant.getCommon() != null ? plant.getCommon() : "").build();

		TextMessage textMessage = session.createTextMessage(plantJson.toString());
		producer.send(textMessage);
		connection.stop();
		
	}

}
