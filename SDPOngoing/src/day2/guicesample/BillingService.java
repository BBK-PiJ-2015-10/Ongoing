package day2.guicesample;

import com.google.inject.Inject;

public class BillingService {
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    @Inject
    public BillingService(CreditCardProcessor processor,
                          TransactionLog transactionLog) {
        this.processor = processor;
        this.transactionLog = transactionLog;
    }

    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        throw new UnsupportedOperationException();
    }

    //This is beautiful, he is basically overwriting the toString() method from the class Object.
    public String toString(){
        return "CCP " + processor + "\n" + "Trans " + transactionLog;
    }
}