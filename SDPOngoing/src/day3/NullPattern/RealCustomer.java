package day3.NullPattern;

public class RealCustomer extends AbstractCustomer {
	
	RealCustomer(String name){
		this.name = name;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	

}
