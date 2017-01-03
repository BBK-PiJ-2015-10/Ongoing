package day1.ex1;

public class Driver {

	public static void main (String [] args) {
	
		//Your code goes here
		
		Storage <BankAccount> aStorage = new Storage<>();
		Storage <String> sStorage = new Storage<>();
		
		//1. Using generics to avoid defining getter and setters methods for class types. Though, not convinced. 
		
		/*2. Potentially:
		*    - Maybe we have more than just two classes, we don't want to have to create setters and getters
		*    for all of them.
		*/
		
		//Class baCls = BankAccount.class;
		Class<BankAccount> baCls = BankAccount.class;
		
		try {	
			
			//*The below obviously creates a type Object.
			//Object myAccount = baCls.newInstance();
			//*The below still creates an instance of class Object, if you want it to be BankAccount you need
			//to cast it.
			//BankAccount myAccount = baCls.newInstance();
			BankAccount myAccount = (BankAccount) baCls.newInstance();
			aStorage.setValue(myAccount);
			
			//Deposit
			myAccount.deposit(15);
		}
		catch ( InstantiationException e){
			//
		}
		catch (IllegalAccessException e){
			//
		}
		
		
		System.out.println(aStorage.getValue().showBalance());
		
		if (aStorage.getClass() == sStorage.getClass()){
			System.out.println("Equal");
			System.out.println(aStorage.getClass());
			System.out.println(sStorage.getClass());
		}
		else {
			System.out.println("Not Equal");
		}
		
		
	
		//3. Incompatible types errors, myAccount is a different type of Object than BankAccount.
		
		//4. Incompatibl type errors. baCls.newInstance() object can't be converted to BankAccount.
		
		/*5.
		*   a. It casts the object into a BankAccount type.
		*   b. Don't know. I assume compiler.
		*   c. Don't know either.
		*/	
		
		/*6
		*   a. Same.
		*   b. Doesn't seem like.
		*   c. 
		*   d.
		*/
		
		/*7
		*  a. 115, and yes.
		*  b. The class wrapped inside the generics doesn't matter. The generic class becomes the class.
		*/
		
		
	
	}

}