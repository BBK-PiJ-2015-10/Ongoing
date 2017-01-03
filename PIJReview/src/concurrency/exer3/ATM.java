package concurrency.exer3;

public class ATM implements Runnable {

	private BankAccount account;
	
	public ATM(BankAccount account){
		this.account=account;
	}
	
	@Override
	public void run() {
		
		System.out.println("Beginning balance is: " +account.getBalance());
		account.deposit(1);
		try {
			Thread.sleep(1000);
		} catch (Exception ex){
			
		}
		
		account.retrieve(1);
		System.out.println("Ending balance is: " +account.getBalance());
		
	}
	
	

}
