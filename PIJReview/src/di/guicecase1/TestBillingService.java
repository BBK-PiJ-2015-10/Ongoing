package di.guicecase1;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestBillingService {

	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new BillingModule());
		
		BillingService billingService = injector.getInstance(BillingService.class);
		
		System.out.println(billingService);
		

	}

}
