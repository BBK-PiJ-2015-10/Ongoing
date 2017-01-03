package di.guicecase1;

public class DatabaseTransactionLog implements TransactionLog {
	
	@Override
	public String toString(){
		return this.getClass().getName();
	}

}
