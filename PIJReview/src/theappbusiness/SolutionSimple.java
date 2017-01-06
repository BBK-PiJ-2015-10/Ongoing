package theappbusiness;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SolutionSimple {

	public static void main(String[] args) {
		
		Integer [] array1 = {1,1,1,2,2,2,1,1,2,2,6,2,1,8};
		//System.out.println(isEqual(10,Arrays.asList(array1)));
		
		Integer [] array2 = {53,800,0,0,0,356,8988,1,1};
		//System.out.println(isEqual(4,Arrays.asList(array2)));
		
		Integer [] array3 ={};
		System.out.println(isEqual(0,Arrays.asList(array3)));
		
		Integer [] array4 ={1,1,1,1,1,1,1};
		System.out.println(isEqual(7,Arrays.asList(array4)));
		//System.out.println(calculateLargestSlice(Arrays.asList(array4)));
		
		Integer [] array5 ={1,2,2,2,2,2};
		System.out.println(isEqual(6,Arrays.asList(array5)));
		
		Integer [] array6 ={1,3,1,3,3,1,1,1,3,1};
		System.out.println(isEqual(10,Arrays.asList(array6)));
		System.out.println(calculateLargestSlice(Arrays.asList(array6)));
		
		Integer [] array7 ={5,6};
		System.out.println(isEqual(2,Arrays.asList(array7)));
		
		Integer [] array8 = {3,1,0,2,2,3,1,2,1,1,1,2};
		//System.out.println(isEqual(6,Arrays.asList(array8)));
		//System.out.println(calculateLargestSlice(Arrays.asList(array8)));
		
		
	}
	
	public static boolean isEqual(int inputValue,List<Integer> inputList){
		if(inputValue==calculateLargestSlice(inputList)){
			return true;
		}
		return false;
	}
	
	

	private static int calculateLargestSlice(List<Integer> inputSequence) {  
		
		int maxSlice=0;
		Integer currentNumber=null;
		Integer priorNumber=null;
		Integer currentArrayCount=null;
		Integer priorArrayCount=null;
		
		for(int count=0;count<inputSequence.size();count++){
			Integer value = inputSequence.get(count);
			if (currentNumber==null ){
				currentNumber=value;
				currentArrayCount=1;
				if (maxSlice<currentArrayCount){
					maxSlice=currentArrayCount;
				}
			}
			else {
				if (value==currentNumber && (priorNumber==null || priorNumber!=value)){
					currentArrayCount++;
					//System.out.println(currentArrayCount);
					if (maxSlice<currentArrayCount){
						maxSlice=currentArrayCount;
					}
				}
				else {
					if (value!=currentNumber && priorNumber==null){
						priorNumber=currentNumber;
						priorArrayCount=currentArrayCount;
						priorArrayCount++;
						if (maxSlice<priorArrayCount){
							maxSlice=priorArrayCount;
						}
						currentNumber=value;
						currentArrayCount++;
					}
					else {
						if (value!=currentNumber && value==priorNumber){
							int temp1=currentNumber;
							int temp2=currentArrayCount;
							currentNumber=priorNumber;
							currentArrayCount=priorArrayCount;
							currentArrayCount++;
							if (maxSlice<currentArrayCount){
								maxSlice=currentArrayCount;
							}
							priorNumber=temp1;
							priorArrayCount=temp2+1;
						}
						else {
							if (value!=currentNumber && value!=priorNumber){
								priorNumber=currentNumber;
								priorArrayCount=currentArrayCount;
								priorArrayCount++;
								//System.out.println("Count for " +priorNumber +" is "+priorArrayCount);
								currentNumber=value;
								currentArrayCount=1;
								if (maxSlice<currentArrayCount){
									maxSlice=currentArrayCount;
								}	
							}
						}
					}	
				}				
			}
			
		}
		return maxSlice;
	
		
		
     
    }
	
	
}
