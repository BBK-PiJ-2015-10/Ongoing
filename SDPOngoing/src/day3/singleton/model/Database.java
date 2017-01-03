package day3.singleton.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    //This helps creating a unique object of type Database, in combination with
	//with a private constructor method and the getInstance() method.
	private static Database instance = new Database();

    private Connection con;

    //Make it private, prevents anyone from creating any new instances of the Database
    //object but the Database class itself.
    private Database() {

    }

    public static Database getInstance() {
        return instance;
    }

    
    //Below is an example of lazzy instanciation, since it is not
    //created until someone calls the getInstanceOld()
    //Disadvantage, it is not thread safe, since getInstance is not atomic.
	/*
	private static Database instanceOld;
	
	public static Database getInstanceOld() {
		if(instanceOld == null) {
			instanceOld = new Database();
		}
		
		return instanceOld;
	}
	*/

    /*
     * Add whatever methods you like to your singleton class.
     */
    public void connect() throws Exception {
        if (con != null)
            return;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver not found");
        }

        String url = String.format("jdbc:mysql://localhost:%d/patterns", 3306);

        con = DriverManager.getConnection(url, "squiffy", "letmein");
    }

    public void disconnect() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Can't close connection");
            }
        }

        con = null;
    }

}
