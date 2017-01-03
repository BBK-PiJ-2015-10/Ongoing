package day3.CompositePattern;

public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee CEO = new Employee("Alejandro Palacios","CEO",300000);
		
		Employee headSales = new Employee("Cassandra","Head Sales",20000);
		
		Employee headMarketing = new Employee("Rafaella","Head Marketing",20000);
		
		Employee clerk1 = new Employee("Tom","Marketing",10000);
		
		Employee clerk2 = new Employee("Robert","Marketing",10000);
		
		Employee salesExecutive1 = new Employee("Giullio","Sales",7000);
		
		Employee salesExecutive2 = new Employee("Trilly","Sales",5000);
		
		Employee peon = new Employee("Peon","Report to clerk1",20000);
				
		
		CEO.add(headSales);
		
		
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		CEO.add(headMarketing);
		
		//clerk1.add(peon);
		
		
		
		//System.out.println(CEO);
		for (Employee headEmployee: CEO.getSubordinates()){
			System.out.println(headEmployee);
			for (Employee employee : headEmployee.getSubordinates()){
				System.out.println(employee);
			}
		}
		
		
		
		
		
		
	}

}
