package day3.NullPattern;

public class NullPatternDemo {

	public static void main(String[] args) {
		
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Leon");
		
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Leonel");
		
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Rabitto");
		
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Tontolone");
		
		System.out.println(customer1.getName());
		
		System.out.println(customer2.getName());
		
		System.out.println(customer3.getName());
		
		System.out.println(customer4.getName());
		
		
		
		
		// TODO Auto-generated method stub

	}

}
