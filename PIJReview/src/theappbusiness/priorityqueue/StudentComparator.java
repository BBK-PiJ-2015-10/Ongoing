package theappbusiness.priorityqueue;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student2> {

	@Override
	public int compare(Student2 stu1, Student2 stu2) {
		Double gp1 = stu1.getGpa();
		Double gp2 = stu2.getGpa();		
		if (stu1.getGpa()!=stu2.getGpa()){
			return -(gp1.compareTo(gp2));
		}
		String name1 = stu1.getName();
		String name2 = stu2.getName();
		if (!name1.equals(name2)){
			int result = name1.compareTo(name2);
			if (result>0){
				return 1;
			}
			else {
				return -1;
			}
		}
		Integer token1 = stu1.getToken();
		Integer token2 = stu2.getToken();
		return token1.compareTo(token2);
	}	
		
}
