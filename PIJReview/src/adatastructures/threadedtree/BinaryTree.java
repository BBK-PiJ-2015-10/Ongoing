package adatastructures.threadedtree;

import java.util.Stack;

public class BinaryTree<T extends Comparable> {
	
	Node<T> root;
	
	public BinaryTree(){
		root = null;
	}
	
	public void insert(T data){
		root = insert(root, data);
	}
		
	private Node<T> insert(Node<T> node, T data){
		if (node==null){
			node = new Node<T>(data);
		}
		else if (node.getData().compareTo(data)==1){
			node.setLeft(insert(node.getLeft(),data));
		}
		else if (node.getData().compareTo(data)==-1) {
			node.setRight(insert(node.getRight(),data));
		}
		return node;
	}
	
	
	public void preOrder(){
		preOrder(root);
		System.out.println();
	}
	
	private void preOrder(Node<T> node){
		if (node!=null){		
			System.out.print(node.getData()+",");
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}
	
	
	public void inOrder(){
		if (root==null){
			return;
		}
		Stack<Node<T>> stack = new Stack();
		Node<T> temp = root;
		while (true){
			if (temp!=null){
				stack.push(temp);
				temp=temp.getLeft();
			}
			else {
				if (stack.isEmpty()){
					return;
				}
				temp=stack.pop();
			    System.out.println(temp.getData());
			    temp=temp.getRight();
			}
		}
	}
	
	
	public int size(){
		return size(root);	
	}
	
	private int size (Node<T> node){
		if (node==null){
			return 0;
		}
		else {
			return 1 + size(node.getLeft())+size(node.getRight());
		}
	}
	
	public boolean contains(T value){
		if (root==null){
			return false;
		}
		else {
			return contains(root,value);
		}
	}
	
	private boolean contains(Node<T>node, T value){
		if (node==null){
			return false;
		}
		int temp = node.getData().compareTo(value);
		if (temp==0){
			return true;
		}
		else if (temp==1){
			return contains(node.getLeft(),value);
		}
		else {
			return contains(node.getRight(),value);
		}		
	}
	
	
	

}
