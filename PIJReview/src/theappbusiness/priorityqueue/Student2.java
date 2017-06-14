package theappbusiness.priorityqueue;

public class Student2 {
	
	private String name;
	
	private double gpa;
	
	private int token;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}

	public Student2(String name, int gpa, int token) {
		this.name = name;
		this.gpa = gpa;
		this.token = token;
	}
	
	public Student2(){
		
	}
	
	@Override
	public String toString(){
		return this.name + " " +this.gpa + " " + this.token;
	}


}
