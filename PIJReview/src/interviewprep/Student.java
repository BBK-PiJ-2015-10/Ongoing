package interviewprep;

public class Student extends Person {

	private int studentID;
	
	public Student(String name) {
		super(name);
	}
	
	public Student(String name,int studentID){
		super(name);
		this.studentID=studentID;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	

	
}
