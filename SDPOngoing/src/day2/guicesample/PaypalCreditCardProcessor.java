package day2.guicesample;

public class PaypalCreditCardProcessor implements CreditCardProcessor {
    public String toString(){
        return getClass().getName();
    }
}
