package classSamples.revisionsession;

public class Exer4 {

	public static void something(int n){
		if (n < 0){
			System.out.print("-");
			something(-n);
		} else if (n < 10){
			System.out.println(n);
		} else {
			int two = n % 100;
			//System.out.println("This is the value of two" +two);
			System.out.print(two/10);
			System.out.print(two % 10);
			something(n/100);
		}
		
	}
	
	
	public static void launch(){
		
		something(7);
		something(825);
		something(38947);
		something(612305);
		something(-12345678);
		
		/*
		* Answer, it divides the number in pairs and moves the pairs from the right side of the number to the
		* the left. The last pair becomes the first, and the first pair of the orginal number becomes the last
		* if the number has an even number of elements then it adds a 0 at the end. If the the number has an
		* odd number of elements it leaves the first element of the original number, the one without pair,
		* as the last number of the new number.
		*/
		
		
		/*
		 * Take away point:
		 * If you insert a (825/100) into a method that only takes int, it will accept it but will around it
		 * to the root.
		 * If you print (825/100), it will print only the root, and no decimals. However, if you print(0.825/100)
		 * it will print 0.00825
		 */
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exer4 exer = new Exer4();
		exer.launch();

	}

}
