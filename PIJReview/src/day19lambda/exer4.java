package day19lambda;

public class exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "ale";
		String test2 = "biruta";
		
		System.out.println(betterElement(test1,test2,(n1,n2) ->n1.length()>n2.length()));
		
		System.out.println(betterElement(2,4,(n1,n2)->n1>n2));
		

	}
	
	public static <T> T betterElement(T input1, T input2, TwoElementPredicate<T> test){
		return (test.better(input1,input2)? input1:input2);
	}

}
