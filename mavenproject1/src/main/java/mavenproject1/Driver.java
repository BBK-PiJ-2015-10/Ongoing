package mavenproject1;

import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Relationship;
import java.io.File;

/*
 * Tutorial Source:
 * https://www.youtube.com/watch?v=-g-vCsZO_3g
 * 
 */


public class Driver {

	public enum NodeType implements Label {
		Person, Course; 
	}
	
	public enum RelationType implements RelationshipType {
		Knows, BelongsTo;
	}
	
	public static void main(String[] args) {
		
		//String address = "C:\\tester\\data\\graph.db";
		String address = "C:\\Users\\YasserAlejandro\\Documents\\Neo4j\\default.graphdb";
		
		File file = new File(address);
		
		GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
		
		//GraphDatabaseService graphdb = dbFactory.newEmbeddedDatabase("C:\\tester\\data\\graph.db");
		GraphDatabaseService graphdb = dbFactory.newEmbeddedDatabase(file);
		//GraphDatabaseService graphdb = dbFactory.newEmbeddedDatabase("C:\\Users\\YasserAlejandro\\Documents\\Neo4j\\default.graphdb");
		
		
		try (Transaction tx = graphdb.beginTx()){
			Node bobNode = graphdb.createNode(NodeType.Person);
			bobNode.setProperty("Pid",5001);
			bobNode.setProperty("Name","Bob");
			bobNode.setProperty("Age","41");
			
			Node aliceNode = graphdb.createNode(NodeType.Person);
			aliceNode.setProperty("Pid",5002);
			aliceNode.setProperty("Name","Alice");
			
			
			Node eveNode = graphdb.createNode(NodeType.Person);
			eveNode.setProperty("Name","Eve");
			
			Node itNode = graphdb.createNode(NodeType.Course);
			itNode.setProperty("Id",1);
			itNode.setProperty("Name","IT Beginners");
			itNode.setProperty("Location","Room 153");
			
			Node electronicNode = graphdb.createNode(NodeType.Course);
			electronicNode.setProperty("Name","Electronics Advanced");
			
			bobNode.createRelationshipTo(aliceNode,RelationType.Knows);
			
			Relationship bobRelIT = bobNode.createRelationshipTo(itNode,RelationType.BelongsTo);
			bobRelIT.setProperty("function","Student");
			
			Relationship bobRelElectronics = bobNode.createRelationshipTo(electronicNode,RelationType.BelongsTo);
			bobRelElectronics.setProperty("function","Teacher");
			
			Relationship aliceRelIT = aliceNode.createRelationshipTo(itNode,RelationType.BelongsTo);
			aliceRelIT.setProperty("function","Teacher");
			
			tx.success();
			
			System.out.println("This worked again again");
			
	
		
		}
		
		graphdb.shutdown();
		
	}

}
