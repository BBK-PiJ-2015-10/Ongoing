package day3.NullPattern;

public class CustomerFactory {
	
	private static final String[] names = {"Leon","Tiger","Cookie","Rabitto"};
	
	public static AbstractCustomer getCustomer(String name){
		for (int i=0 ; i < names.length; i++){
			if(names[i].equalsIgnoreCase(name)){
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}

}
