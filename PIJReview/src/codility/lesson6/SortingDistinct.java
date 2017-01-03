package codility.lesson6;

import java.util.Arrays;

public class SortingDistinct {
	
	public static void main (String[] arrays ) {
		
		System.out.println("This is lesson 6");
		
		int [] test = {2,1,1,2,3,1};
		
		int [] test2= {2};
		
		int [] test3= {2,2};
		
		int [] test4= {3,3,3};
		
		int [] test5= {-1,-2,-1,-4,-2};
		
		SortingDistinct sd = new SortingDistinct();
		System.out.println(sd.solution(test5));
		System.out.println(sd.solution(test2));
		System.out.println(sd.solution(test3));
		System.out.println(sd.solution(test4));
		
	}
	
	
	private int solution(int A[]){
	    if (A.length==0){
	    	return 0;
	    }
	    else if (A.length==1) {
	    	return 1;
	    }
		else {
			Arrays.sort(A);
			int count=0;
			//if (A.length==2){
		    	//if(A[0]<A[1]){
					//count++;
					//count++;
				//}
		    	//else {
		    		//count++;
		    	//}
			//}
			//else {
				for (int i=0;i<A.length-1;i++){
					if (i==A.length-2){
						if(A[i]<A[i+1]){
							count =count+2;
						}
						else {
							count++;
						}
					}
					else {
						if (A[i]<A[i+1]){
							count++;
						}
					}				
				}
			//}
			return count;
	    }
	}    

}
