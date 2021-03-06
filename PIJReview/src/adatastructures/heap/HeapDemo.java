package adatastructures.heap;

public class HeapDemo {

	public static void main(String[] args) {
		
		MinHeap q = new MinHeap();
		q.add(new WorkOrder(3,"Shampoo Carpets"));
		q.add(new WorkOrder(7,"Empty car seats"));
		q.add(new WorkOrder(8,"Water Plants"));
		q.add(new WorkOrder(10,"Remove pencil"));
		q.add(new WorkOrder(1,"Fix Broken Sink"));
		q.add(new WorkOrder(9,"Clean Coffee maker"));
		q.add(new WorkOrder(2,"Order cleaning supplies"));
		
		while (q.size()>0){
			System.out.println(q.remove());
		}

	}

}
