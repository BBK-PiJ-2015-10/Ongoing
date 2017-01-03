package adatastructures.heap;

public class WorkOrder implements Comparable {
	
	private int priority;
	
	private String description;
	
	public WorkOrder(int priority,String description){
		this.priority=priority;
		this.description=description;
	}
	
	public String toString(){
		return "priority="+priority +",description=" +description; 
	}

	@Override
	public int compareTo(Object otherObject) {
		WorkOrder other = (WorkOrder) otherObject;
		if (priority < other.priority) return -1;
		if (priority > other.priority) return 1;
		return 0;
	}

}
