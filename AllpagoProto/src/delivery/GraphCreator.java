package delivery;

import java.util.Scanner;
import java.util.Map;
import java.text.NumberFormat;
import java.util.HashMap;
import java.text.ParseException;
import java.util.Iterator;

import java.util.PriorityQueue;

public class GraphCreator {
	
	private String testIndicator = "@"; 
	
	private String nodeDelimiter = ",";
	
	private String distanceDelimeter = ":";
	
	private Map<String,Node<String>> nodeMap = new HashMap<String,Node<String>>();
	
	private Map<Node<String>,Number> pathWeights = new HashMap<Node<String>,Number>();
	
	PriorityQueue<Node<String>> frontier = new PriorityQueue<Node<String>>();
	
	
	private void createNode(String[] sentence){
		String sourceNodeName = sentence[0];
		Node<String> sourceNode;
		if (!nodeMap.containsKey(sourceNodeName)){
			sourceNode = new Node<String>(sourceNodeName);
		}
		else {
			sourceNode = nodeMap.get(sourceNodeName);
		}
			
		for (int i=1;i<sentence.length;i++){
			String[] linkData = sentence[i].split(distanceDelimeter);
			String destNodeName = linkData[0];
			Number linkWeight = null;
			try {
				linkWeight = NumberFormat.getInstance().parse(linkData[1]);
			} catch (ParseException ex){
				System.out.println("Need to figure out how to handle this");
			}
			Node<String> destNode;
			if (nodeMap.containsKey(destNodeName)){
				destNode=nodeMap.get(destNodeName);
			}
			else {
				destNode = new Node<String>(destNodeName);
			}
			Link<Node<String>,Number> newLink = new Link<Node<String>,Number>();
			newLink.setSource(sourceNode);
			newLink.setDestination(destNode);
			newLink.setLength(linkWeight);
			sourceNode.addLink(newLink);
		}
		
		nodeMap.put(sourceNodeName,sourceNode);
	
	}
	
	
	
	
	public void captureInput(Scanner sc){
		
		while(sc.hasNext()){
			String [] sentence = sc.next().split(nodeDelimiter);
			if (!sentence[0].equals(testIndicator)){
				createNode(sentence);
			}
		}
		
		printGraphTopology();
		
		
	}
	
	public void printGraphTopology(){
		
		for (String value : nodeMap.keySet()){
			System.out.print("Node named : " +value);
			Node tempNode = nodeMap.get(value);
			System.out.println(" has " +tempNode.getLinks().size() +" links");
			System.out.println("which are ");
			Iterator<Link<Node<String>,Integer>> iter = tempNode.getLinks().iterator();
			while(iter.hasNext()){
				Link<Node<String>,Integer> temp = iter.next();
				System.out.print("with a weight of " +temp.getWeight());
				System.out.println(" to " +temp.getOther(tempNode).getnodeID());
			}
	
		}
		
		System.out.println("I created " +nodeMap.size() +" nodes");
		
	}
	
	
	public Integer getMinDistance(Node<String> start, Node<String> target){
		
		nodeMap.values().stream().forEach((n)->pathWeights.put(n,0));
		
		pathWeights.put(start,0);
		
		//nodeMap.values().stream().forEach((n)->pathWeights.put(n., arg1));
		
		//nodeMap.values().forEach(n->pathWeights(n,100.0));
		
		return 0;
	}
	

}
