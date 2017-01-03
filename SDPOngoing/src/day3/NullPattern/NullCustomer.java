package day3.NullPattern;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}
	
	

}
