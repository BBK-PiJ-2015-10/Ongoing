package theappbusiness;

/*
 * Number of ways you can represent a number by 1 and 2
 */

public class NumberOfWays {

	public static void main(String[] args) {
		
		System.out.println(getWays(6));

	}
	
	private static int getWays(int n){
		if (n==0){
			return 0;
		}
		if (n==1){
			return 1;
		}
		else if(n==2){
			return 1;
		}
		else if (n==3){
			return 3;
		}
		else if (n==4){
			return 5;
		}
		else {
			return getWays(n-1)+getWays(n-2);
		}
	}

}
