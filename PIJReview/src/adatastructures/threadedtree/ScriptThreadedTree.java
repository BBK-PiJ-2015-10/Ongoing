package adatastructures.threadedtree;

public class ScriptThreadedTree {

	public static void main(String[] args) {
		
		ScriptThreadedTree stt = new ScriptThreadedTree();
		stt.run();
		
		
		/*
		mytree.insert(6);
		mytree.insert(4);
		mytree.insert(10);
		mytree.insert(2);
		mytree.insert(5);
		mytree.insert(8);
		mytree.insert(14);
		mytree.insert(1);
		mytree.insert(7);
		mytree.insert(13);
		*/
		
		/*
		mytree.insertB(6);
		mytree.insertB(4);
		mytree.insertB(10);
		mytree.insertB(2);
		mytree.insertB(5);
		mytree.insertB(8);
		mytree.insertB(14);
		mytree.insertB(1);
		mytree.insertB(7);
		mytree.insertB(13);
		*/
		
		//System.out.println("The tree has a size of " +mytree.size());
		
		//System.out.println("Pre-order traversal is ");
		//mytree.preOrder();
		
		
		//Integer first = 5;
		
		//Integer second = 9;
		
		//Integer third = 2;
		
		//System.out.println(first.compareTo(second));
		
		//System.out.println(first.compareTo(third));
		
		//System.out.println(mytree.size());
		
		//mytree.preOrder();
		
		//mytree.inOrderSol();
		
		//System.out.println(mytree.contains(10));
		
		//Node<String> first = new Node("ale");
		
		//Person p1 = new Person("ale","tonto");
		
		//Node<Person> second = new Node(p1);
		

	}
	
	public void run(){
		
		BinaryTree<Integer> mytree = new BinaryTree();
		
		Node<Integer> first = new Node(10);
		Node<Integer> second = new Node(20);
		Node<Integer> third = new Node(5);
		
		first.setLeft(third);
		first.setRight(second);
		

		System.out.println("Before is "+ first.getData());
		
		test(first,22);
		
		System.out.println("After is "+ first.getData());
		
		first = test2(first,22);
		
		System.out.println("Second After is "+ first.getData());
		
		
	}
	
	public void test(Node<Integer> src,Integer value){
		src = new Node<Integer>(value);
		//src.setData(value);
	}
	
	public Node<Integer> test2(Node<Integer> src,Integer value){
		return new Node<Integer>(value);
	}
	

}
