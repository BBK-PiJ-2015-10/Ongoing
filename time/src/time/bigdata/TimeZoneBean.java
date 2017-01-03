package time.bigdata;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.sql.DataSource;
//import javax.annotation.Resource;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
//import java.util.logging.Logger;
//import java.util.LinkedHashMap;
import java.util.TreeMap;

@SessionScoped
@ManagedBean(name="TimeZoneBean")
public class TimeZoneBean {
	
	//@Resource(name="jdbc:mysql://LocalHost:3306/multizone")
    //private DataSource source;
	
	private Connection conn;
	
	private DateFormat timeFormatter;
	
	private ArrayList<String> cities;
	
	private String cityToAdd;
	
	private String cityToRemove;
	
	public TimeZoneBean(){
		timeFormatter = DateFormat.getTimeInstance();
		cities = new ArrayList();
	}
	
	public String getCityToAdd() {
		return cityToAdd;
	}

	public void setCityToAdd(String cityToAdd) {
		this.cityToAdd = cityToAdd;
	}


	public String getCityToRemove() {
		return cityToRemove;
	}

	public void setCityToRemove(String cityToRemove) {
		this.cityToRemove = cityToRemove;
	}
	
	public Map<String,String> getCitiesAndTimes(){
		Date time = new Date();
		Map<String,String> result = new TreeMap<String,String>();
		//Map<String,String> result = new LinkedHashMap();
		for (int i=0;i<cities.size();i++){
			String city = cities.get(i);
			String label = city + ": ";
			TimeZone zone = getTimeZone(city);
			if (zone != null){
				timeFormatter.setTimeZone(zone);
				String timeString = timeFormatter.format(time);
				label = label+timeString;
			}
			else {
				label = label + "unavailable";
			}
			result.put(label,city);
		}
		return result;
	}
	
	public String addCity(){
		TimeZone zone = getTimeZone(cityToAdd);
		if (zone==null) return "errortzb";
		cities.add(cityToAdd);
		cityToRemove = cityToAdd;
		cityToAdd ="";
		return "nexttzb";
	}
	
	public String removeCity(){
		cities.remove(cityToRemove);
		if (cities.size()>0) return null;
		else return "indextzb";
	}
	
	private TimeZone getTimeZone(String city){
		String[] ids = TimeZone.getAvailableIDs();
		for (int i=0;i<ids.length;i++){
			if(timeZoneIDmatch(ids[i],city)){
				return TimeZone.getTimeZone(ids[i]);
			}
		}
		try {
			String id = getZoneNameFromDB(city);
			if (id != null){
				return TimeZone.getTimeZone(id);
			}
		} catch(SQLException ex){
			ex.printStackTrace();
		}
		return null;
	}

	private boolean timeZoneIDmatch(String id, String city){
		String idCity = id.substring(id.indexOf('/')+1);
		return idCity.replace('_',' ').equals(city);
	}



	private String getZoneNameFromDB(String city) throws SQLException{
			
			//if (source == null){
				//Logger.global.info("No database connection TONTO");
			//}
			//conn = source.getConnection("root","tonto");
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn = DriverManager.getConnection("jdbc:mysql://LocalHost:3306/multizone","root","tonto");
		try {
			PreparedStatement stat = conn.prepareStatement(
			"SELECT Zone FROM CityZone WHERE City=?");
			stat.setString(1, city);
			ResultSet result = stat.executeQuery();
			if (result.next())
				return result.getString(1);
			else 
				System.out.println("Didn't find anything");
				return null;
			
		} catch (SQLException ex){
			ex.printStackTrace();
		} finally {
			conn.close();
		}
		return null;
	}
	
	
	
	


}
