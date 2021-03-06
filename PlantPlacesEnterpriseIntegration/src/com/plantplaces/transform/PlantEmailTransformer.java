package com.plantplaces.transform;

import org.json.JSONObject;

public class PlantEmailTransformer {
	
	public String doTransform(String message){
		String returnString ="";
		if (message!=null && !message.isEmpty()){
			JSONObject plant = new JSONObject(message);
			String genus = plant.getString("genus");
			String species= plant.getString("species");
			String cultivar = plant.getString("cultivar");
			String common = plant.getString("common");
			
			
			StringBuilder sb = new StringBuilder();
			sb.append("Genus: ").append(genus).append("\n");
			sb.append("Species: ").append(species).append("\n");
			sb.append("Cultivar: ").append(cultivar).append("\n");
			sb.append("Common: ").append(common).append("\n");
			returnString=sb.toString();
			
		} else {
			returnString="No Plant Information";
		}
		
		return "Details of New Plant Added: \n" +returnString;
		
		
	}

}
