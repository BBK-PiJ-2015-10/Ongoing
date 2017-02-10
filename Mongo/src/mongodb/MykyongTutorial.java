package mongodb;

import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

import com.mongodb.DBObject;

import java.util.Date;

public class MykyongTutorial {

	public static void main(String[] args) {
		
		//This is to connect to a MongoDB server
		MongoClient mongo = new MongoClient("localhost",27017);
		
		DB db = mongo.getDB("kyongdata");
		
		//A DBCollection is a table within a database, a database
		//can contain several tables
		DBCollection table = db.getCollection("demotable");
		
		//This is a document object
		BasicDBObject document = new BasicDBObject();
		
		
		
		/*
		
		//This is put a document in a table
		
		document.put("name","yasser");
		document.put("lastname","palacios");
		document.put("age",41);
		document.put("createdDate",new Date());
		table.insert(document);
		
		
		document.put("name","heidi");
		document.put("lastname","palacios");
		document.put("age",41);
		document.put("createdDate",new Date());
		table.insert(document);
		
		/*
		
		//This is to query a table
		
		BasicDBObject query = new BasicDBObject();
		query.put("age",41);
		DBCursor cursor = table.find(query);
		
		while(cursor.hasNext()){
			System.out.println(cursor.next());
		}
		
		
		
		//This is to update a document internal information
		
		BasicDBObject query2 = new BasicDBObject();
		query2.put("name","heidi");
		
		BasicDBObject newDocument = new BasicDBObject();
		newDocument.put("name","catherine");
		
		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set",newDocument);
		
		table.update(query2, updateObj);
		
	
		//This is to remove a document from a table
		
		BasicDBObject query3 = new BasicDBObject();
		query3.put("name","yasser");
		table.remove(query3);
		
		*/
		
		BasicDBObject query4 = new BasicDBObject();
		query4.put("age",4);
		
		/*
		
		BasicDBObject document3 = new BasicDBObject();
		document3.put("name","family");
		document3.put("girl",query4);
		document3.put("age",41);
		table.insert(document3);
		
		//If wanted to remove a record
		table.remove(query4)
				
		//Inserting a document and making references of that document in another document
		
		BasicDBObject document4 = new BasicDBObject();
		document4.put("name","leon");
		document4.put("age",4);
		table.insert(document4);
		
		BasicDBObject document5 = new BasicDBObject();
		document5.put("name","Alejito");
		document5.put("age",41);
		document5.put("mascott",document4);
		table.insert(document5);
		
	
		//Getting a hold of an existing document and inserting as a field in another document
		
		BasicDBObject query5 = new BasicDBObject();
		query5.put("name","bibio");	
		DBObject document6 = table.findOne(query5);
		
		BasicDBObject document7 = new BasicDBObject();
		document7.put("name","trilly");
		document7.put("age",4);
		document7.put("fratello",document6);
		table.insert(document7);
	
		*/
		
		DBCursor cursor4 = table.find(query4);
		while(cursor4.hasNext()){
			System.out.println(cursor4.next());
		}
		
	
	

	}

}
