package mongodb;

import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;

import java.net.UnknownHostException;


public class InsertDriver {
	
	public static void main(String[] args)  {
		
		/*
		 * Video Tutorial Source:
		 * https://www.youtube.com/watch?v=dcVjEqRrI_s
		 * 
		 * once inside the bin folder via prompt
		 * mongod --dbpath C:\mongodata --smallfiles 
		 */
		
		DB db = (new MongoClient("localhost",27017)).getDB("zoneacademydatabase");
		DBCollection dbCollection = db.getCollection("Channel");
		BasicDBObject basicDBObject = new BasicDBObject();
		/*
		basicDBObject.put("name","zoneacademy");
		basicDBObject.put("subscriptions",4100);
		dbCollection.insert(basicDBObject);
		System.out.println("Ale Tonto");
		*/
		 
		basicDBObject.put("name","zoneclass");
		basicDBObject.put("subscriptions",4500);
		dbCollection.insert(basicDBObject);

	}

}
