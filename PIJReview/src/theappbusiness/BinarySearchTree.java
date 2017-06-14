package theappbusiness;

public class BinarySearchTree {
	
	private Node root;
	
	public BinarySearchTree (){
		root = null;
	}
	
	public void add (Comparable obj){
		if (obj==null){
			return;
		}
		Node newNode = new Node();
		newNode.data=obj;
		newNode.left=null;
		newNode.right=null;
		if (root==null) root = newNode;
		else root.addNode(newNode);
	}
	
	public boolean find(Comparable obj){
		if (obj==null){
			return false;
		}
		Node current=root;
		while (current!=null){
			int d = current.data.compareTo(obj);
			if (d==0) return true;
			else if (d>0) current=current.left;
			else if (d<0) current=current.right;
		}
		return false;
	}
	
	public void remove(Comparable obj){
		if (obj==null){
			return;
		}
		
		Node toBeRemoved=root;
		Node parent=null;
		boolean found=false;
		
		while (!found && toBeRemoved!=null){
			
			int d = toBeRemoved.data.compareTo(obj);
			if (d==0) found=true;
			else {
				parent=toBeRemoved;
				if (d>0) toBeRemoved=toBeRemoved.left;
				else toBeRemoved=toBeRemoved.right;
			}
			
		}
		
		if (!found) return;
		
		if (toBeRemoved.left==null && toBeRemoved.right==null){
			
			
			
			
		}
		
		
	}
	
	
	
	class Node {
		
		private Comparable data;
		
		private Node left;
		
		private Node right;
		
		public Comparable getData() {
			return data;
		}

		public void setData(Comparable data) {
			this.data = data;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}
		
		public void addNode(Node newNode){
			int comp = newNode.data.compareTo(data);
			if (comp < 0){
				if (left==null) left=newNode;
				else left.addNode(newNode);
			}
			else if (comp > 0){
				if (right==null) right=newNode;
				else right.addNode(newNode);
			}
		}
		
		
	}

}
