package adatastructures.tree;

import java.lang.Math;

public class BinaryTree {

	Node root;
	
	BinaryTree(){
		root=null;
	}
	
	public void insert(int data){
		root = insert(root,data);
	}
	
	public Node insert(Node node,int data){
		if (node==null){
			node=new Node(data);
		}
		else {
			if (node.getData()>data){
				node.setLeft(insert(node.getLeft(),data));
			}
			else if (node.getData()<data){
				node.setRight(insert(node.getRight(),data));
			}
		}
		return node;
	}
	
	public boolean lookup(int value){
		return lookup(value,root);
	}
	
	private boolean lookup(int value,Node node){
		if (node==null){
			return false;
		}
		else {
			if (node.getData()==value){
				return true;
			}
			else {
				if (node.getData()>value){
					return lookup(value,node.getLeft());
				}
				else {
					return lookup(value,node.getRight());
				}
				
			}
		}
	}
	
	public int size(){
		return size(root);
	}
	
	public int size(Node node){
		if (node==null){
			return 0;
		}
		else {
			return (1+size(node.getLeft())+size(node.getRight()));
		}
	}
	
	public int maxDepth(){
		return maxDepth(root);
	}
	
	public int maxDepth(Node node){
		if (node==null){
			return 0;
		}
		else {
			return(1+Math.max(maxDepth(node.getLeft()),maxDepth(node.getRight())));
		}
	}
	


}
