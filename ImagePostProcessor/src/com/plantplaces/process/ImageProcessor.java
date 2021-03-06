package com.plantplaces.process;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageProcessor implements Runnable {
	
	public static void main (String[] args) {
		
		//Create an instance of an object and run it with a new thread
		Runnable ip = new ImageProcessor();
		Thread t = new Thread(ip);
		t.start();
		
	}

	@Override
	public void run()  {
		
		ActiveMQConnectionFactory jmsConnectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
		Connection connection = null;
		
		try {
			connection= jmsConnectionFactory.createConnection();
			connection.start();
			Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
			Queue photoQueue = session.createQueue("photos");
			MessageConsumer consumer = session.createConsumer(photoQueue);
			
			//infinite loop that listens for messages
			while(true){
				TextMessage message = (TextMessage) consumer.receive();
				String payload = message.getText();
				//do photo processing
				
				//Creates a file that represents the image that was uploaded
				File file = new File(payload);
				//The directory where the watermark exists
				String dirAddress = "/Users/YasserAlejandro/SDP/Ongoing/PlantPlacesYAP/WebContent/resources/images";
				File directory = new File(dirAddress);
				//get the watermark
				BufferedImage watermark = ImageIO.read(new File(directory,"watermark.png"));
				//use Thumbnailator to add the watermark to the image
				Thumbnails.of(file).scale(1).watermark(Positions.BOTTOM_RIGHT,watermark,0.9f).toFile(file);
				
				System.out.println(payload);
			}
			
			//connection.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (connection!=null){
			try {
				connection.stop();
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}		
	}

}
