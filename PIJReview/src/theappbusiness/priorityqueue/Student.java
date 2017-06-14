package theappbusiness.priorityqueue;

public class Student implements Comparable {

	private String name;
	
	private Double gpa;
	
	private Integer token;

	public double getGpa() {
		return gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getToken() {
		return token;
	}

	public void setToken(Integer token) {
		this.token = token;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Object other) {
		Student otherStudent = (Student) other;
		if(!this.gpa.equals(otherStudent.gpa)){
			return -(this.gpa.compareTo(otherStudent.gpa));
		}
		else if (!this.name.equals(otherStudent.name)){
			int result = this.name.compareTo(otherStudent.name);
			if (result>0){
				return 1;
			}
			else {
				return -1;
			}		
		}
		else if (this.token!=otherStudent.token){
			return (this.token.compareTo(otherStudent.token));
		}
		return 0;
	}
	
	public Student(String name, Double gpa, Integer token) {
		this.gpa = gpa;
		this.name = name;
		this.token = token;
	}
	
	public Student(){
	}

	@Override
	public String toString(){
		return this.name + " " +this.gpa + " " + this.token;
	}
	
	
}
