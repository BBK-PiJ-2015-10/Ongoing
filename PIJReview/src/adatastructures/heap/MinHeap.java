package adatastructures.heap;

import java.util.ArrayList;


public class MinHeap {

	private ArrayList<Comparable> elements;
	
	public MinHeap(){
		elements = new ArrayList();
		elements.add(null);
	}
	
	//Return elements in the heap, it is -1 since the first element is empty
	public int size(){
		return elements.size()-1;	
	}
	
	private int getLeftChildIndex(int index){
		return 2*index;
	}
	
	private int getRightChildIndex(int index){
		return 2*index+1;
	}
	
	private int getParentIndex(int index){
		return index/2;
	}
	
	private Comparable getLeftChild(int index){
		return elements.get(2*index);
	}
	
	private Comparable getRightChild(int index){
		return elements.get(2*index+1);
	}
	
	
	private Comparable getParent(int index){
		return elements.get(index/2);
	}
	
	public void add(Comparable newElement){
		//Add a new leaf
		elements.add(null);
		int index = elements.size()-1;
		//Demotes parent if smaller, and recalc index ref to take
		//parent's
		while (index>1 && getParent(index).compareTo(newElement)>0){
			elements.set(index,getParent(index));
			index=getParentIndex(index);
		}
		//sets new Element in the ref index
		elements.set(index,newElement);
	}
	
	public Comparable peek(){
		return elements.get(1);
	}
	
	/*
	 * In theory removes the first element, in practice it removes
	 * the last element of the array. Moves this value remove to 
	 * position 1, and executes fixHeap to move that moved value 
	 * into its correct position.
	 */
	public Comparable remove(){
		Comparable minimum = elements.get(1);
		int lastIndex=elements.size()-1;
		Comparable last = elements.remove(lastIndex);
		if (lastIndex > 1){
			elements.set(1,last);
			fixHeap();
		}
		return minimum;
	}
	
	
	//Turns the tree back into a heap provided only the root
	//element was violating the root condition
	private void fixHeap(){
		
		Comparable root = elements.get(1);
		
		int lastIndex = elements.size()-1;
		
		int index=1;
		boolean more=true;
		
		while(more){
			
			//Get smaller child
			
			int childIndex = getLeftChildIndex(index);
			if (childIndex<=lastIndex){
				
				Comparable child = getLeftChild(index);
				
				if (getRightChildIndex(index)<=lastIndex &&
					 getRightChild(index).compareTo(child)<0)
				{
					childIndex=getRightChildIndex(index);
					child = getRightChild(index);
				}
				
				if (child.compareTo(root)<0){
					//Promote Child
					elements.set(index,child);
					index=childIndex;
				}
				else {
					more= false;
				}	
			}
			else {
				more = false;
				
			}
		}
		
		elements.set(index,root);
	}
	
	
	
}
