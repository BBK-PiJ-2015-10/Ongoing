package di.guicecase1;

import com.google.inject.AbstractModule;

public class BillingModule extends AbstractModule {

	@Override
	protected void configure() {
		
		bind(TransactionLog.class).to(DatabaseTransactionLog.class);
		bind(CreditCardProcessor.class).to(PayPalCreditCardProcessor.class);
		
	}

}
