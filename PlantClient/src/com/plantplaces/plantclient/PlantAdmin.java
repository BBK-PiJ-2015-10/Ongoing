package com.plantplaces.plantclient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.plantplaces.dto.Plant;
import com.plantplaces.service.IPlantService;
import com.plantplaces.MyObjectFactory;


import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;

//import org.springframework.beans.factory.annotation.Autowired;


public class PlantAdmin extends JFrame {

	//This is the model where our search results will go
	DefaultListModel listModel;
	
	private JPanel contentPane;
	
	private JTextField txtSearchText;
	
	private IPlantService plantService;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlantAdmin frame = new PlantAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PlantAdmin() {
		listModel=new DefaultListModel();
		
		Plant plant = MyObjectFactory.getBeanFactory().getBean(Plant.class);
		plant.setCommon("Eastern Redbud");
		plant.setGenus("Cercis");
	
		plantService = MyObjectFactory.getBeanFactory().getBean(IPlantService.class);
		
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//return what the user entered in this form
				String searchText = txtSearchText.getText();
				
				List<Plant> allPlants = plantService.filterPlants(searchText);
				for (Plant allPlant : allPlants){
					listModel.addElement(allPlant);
				}
			}
		});
		btnSearch.setBounds(345, -1, 89, 23);
		contentPane.add(btnSearch);
		
		txtSearchText = new JTextField();
		txtSearchText.setBounds(0, 0, 346, 20);
		contentPane.add(txtSearchText);
		txtSearchText.setColumns(10);
		
		JList lstPlants = new JList();
		lstPlants.setModel(listModel);
		/*
		lstPlants.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		*/
		lstPlants.setBounds(0, 23, 434, 238);
		contentPane.add(lstPlants);
	}
}
