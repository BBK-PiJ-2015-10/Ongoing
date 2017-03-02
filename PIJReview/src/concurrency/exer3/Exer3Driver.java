package concurrency.exer3;

import concurrency.exer2.Counter;
import concurrency.exer2.Increaser;

public class Exer3Driver {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		for (int i=0;i<1000;i++){
			ATM atm = new ATM(account);
			Thread t = new Thread(atm);
			t.start();
		}

	}

}
