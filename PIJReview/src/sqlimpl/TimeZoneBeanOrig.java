package sqlimpl;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TimeZoneBeanOrig {
	
	private Connection conn;
	
	public static void main(String[] args) {
		
		TimeZoneBeanOrig tzb = new TimeZoneBeanOrig();
		try {
			System.out.println(tzb.getZoneNameFromDB("Alexander"));
		} catch(SQLException ex){
			ex.printStackTrace();
		}
		
		//System.out.println(tzb.testConnection());
		//tzb.getConnection();

	}
	
	private String getZoneNameFromDB(String city) throws SQLException{
		try {
			conn = DriverManager.getConnection("jdbc:mysql://LocalHost:3306/multizone","root","tonto");
			System.out.println("Connection Succesfull");
			System.out.println(DriverManager.class.getName());
		} catch(SQLException ex){
			ex.printStackTrace();
		}
		try {
			PreparedStatement stat = conn.prepareStatement(
			"SELECT Zone FROM CityZone WHERE City=?");
			stat.setString(1,city);
			ResultSet result = stat.executeQuery();
			if (result.next()){
				return result.getString(1);
			}
			else {
				return null;
			}
		}
		finally {
			conn.close();
		}
	}
	


}
