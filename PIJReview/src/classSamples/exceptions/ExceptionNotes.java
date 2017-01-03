package classSamples.exceptions;

import java.util.Scanner;

public class ExceptionNotes extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * NumberFormatException
		 * When you try to parseInt something that is not a number.
		 * NullPointerException
		 * When the pointer to an object is null
		 * IndexOutOfBoundsException
		 * IllegalArgumentException
		 * 
		 * ex.printStackTrace();
		 * 
		 * runtime exceptions
		 * checked exceptions
		 * 
		 * Finally basically captures the exception.
		 * 
		 * 
		 */
		
		
		//thrower1();
		System.out.println(throwExceptionKeith());
		System.out.println("This shouldn't show up");
		//System.out.println("Write a number with at least 3 digits");
		//int n=getNumber();
		//String isOdd = (n%2 != 0) ? "Odd" : "Even";
        //System.out.println("You entered " +n +" it is " +isOdd +" .");
        
	}
	
	public static int getNumber(){
		int result=0;
		try {
			Scanner scanner = new Scanner(System.in);
			String str;
			str = scanner.next(); 
			result = Integer.parseInt(str);
			System.out.println("You entered :" +result);
			char thirdDigit = str.charAt(2);
			System.out.println("The third digit entered is " +thirdDigit);
			
		} catch (NumberFormatException ex){
			System.out.println("You entered something that is not an integer");
		} catch (IndexOutOfBoundsException ex){
			System.out.println("Your number doesn't have a third digit");
		}
		return result;
	}
	
	public static void doggyMethod() {
		
	}
	
	public static void thrower1(){
		
		try {
			throw new Exception("My first checked exception");
		} catch (Exception e){
			System.out.println("I caught one");
		}
		
	}
	
	public static String throwExceptionKeith() {
        try {

            try {
                System.out.println("Inner Try reached");
                throw new Exception();
            } catch (IllegalArgumentException e) {
                System.out.println("Inner Catch reached");
                return "Returned: Inner Nested catch";
            } catch (IndexOutOfBoundsException e) {
            	 System.out.println("Inner Catch2 reached");
                 return "Returned: Inner Nested2 catch";
            }
            finally {
                System.out.println("Inner Finally reached");
                return "Returned: Inner Nested finally";
            }

        } 
            catch (Exception e) {
            System.out.println("Outer Catch reached");
            return "Returned: Outer Nested catch";
        } finally {
            System.out.println("Outer finally reached");
            return "Returned: Outer Nested finally";
        }
    }
	
	

}
