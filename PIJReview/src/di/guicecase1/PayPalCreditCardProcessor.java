package di.guicecase1;

public class PayPalCreditCardProcessor implements CreditCardProcessor {
	
	public String getName(){
		return this.getClass().getName();
	}

}
