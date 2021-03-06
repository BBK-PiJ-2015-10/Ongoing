package com.plantplaces.client;

import java.rmi.RemoteException;

import javax.swing.JOptionPane;
import javax.xml.rpc.ServiceException;

import com.plantplaces.ui.PlantWSService;
import com.plantplaces.ui.PlantWSServiceServiceLocator;

public class PlantClient {
	
	public static void main (String [] args) {
		
		PlantWSServiceServiceLocator locator = new PlantWSServiceServiceLocator();
		try {
			PlantWSService plantWSService = locator.getPlantWSService();
			//plantWSService is a proxy class, it will take the plant name put it in an xml format
			//move it around the network and submit it into the webservice and get the response back
			String plantName = JOptionPane.showInputDialog("Enter part of a plant name");
			String plant = plantWSService.fetchPlants(plantName);
			//show the result to the user
			JOptionPane.showMessageDialog(null,"The full plant name is : " +plant);
		} catch (ServiceException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Unable to reach service: " +e.getMessage());
		}
		
	}

}
