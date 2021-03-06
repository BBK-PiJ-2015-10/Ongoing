package mavenNeo4jFirst;

import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Relationship;
import java.io.File;

import java.util.Iterator;
//import org.neo4j.graphdb.ResourceIterator;

//import org.neo4j.graphdb.Result;
//import java.util.IteratorUtil;
//import org.neo4j.helpers.collection.IteratorUtil;
//import org.neo4j.cypher.internal.javacompat.ExecutionEngine;
//import org.neo4j.kernel.impl.api.
//import org.neo4j.kernel.impl.util.StringLogger;

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
		GraphDatabaseService graphdb = dbFactory.newEmbeddedDatabase(file);

	
		
		try (Transaction tx = graphdb.beginTx()){
			
			//If I wanted to delete all nodes in the graph
			String deleteNodes= "match (n) optional match (n)-[r]-() delete n,r";
			graphdb.execute(deleteNodes);
			
			//To add nodes to the graph
			
			Node bobNode = graphdb.createNode(NodeType.Person);
			bobNode.setProperty("Pid",5001);
			bobNode.setProperty("Name","Roberto");
			bobNode.setProperty("Age","41");
			
			Node aliceNode = graphdb.createNode(NodeType.Person);
			aliceNode.setProperty("Pid",5002);
			aliceNode.setProperty("Name","Alizia");
			
			
			Node eveNode = graphdb.createNode(NodeType.Person);
			eveNode.setProperty("Name","Evita");
			
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
						
			
			//This is to query the graph, the String statement represents the cypher query
			
			String getPersons="match (n:Person) return n";
			
			Iterator<Node> columns = graphdb.execute(getPersons).columnAs("n");
			
			while (columns.hasNext()){
				Node node = columns.next();
				System.out.println(node +" : " +node.getProperty("Name"));
			}
			
			
			System.out.println("This worked");
			
	
		}
		
		/*
		 * To view go to:
		 * - http://localhost:7474/browser/
		 * - type on cypher language match (n) return n   . This will give you all the nodes.
		 * - match (n:Person) return n . This will only return the Person nodes.
		 * - match (a)-[r:BelongsTo]-(b) return r  . This will give me all the BelongsTo relationships.
		 * - match(n) where n.Name="Bob" return n
		 * - match(a)-[r:BelongsTo]-(b) where a.Name="IT Beginners" return r
		 */
		
		graphdb.shutdown();
		
	}

}
