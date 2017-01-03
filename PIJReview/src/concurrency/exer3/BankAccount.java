package concurrency.exer3;

public class BankAccount {
	
	private Integer balance =0;
	
	public synchronized int getBalance(){
		return this.balance;
	}
	
	public synchronized void deposit(int money){
		
			balance=balance+money;
		
	}
	
	public synchronized int retrieve(int money){
		//synchronized (this) {
			//int result =0;
			//if (balance > money){
				//result = money;
			//} else {
				//result = balance;
			//}
			balance = balance - money;
			return money;
		//}
	}
	

}
