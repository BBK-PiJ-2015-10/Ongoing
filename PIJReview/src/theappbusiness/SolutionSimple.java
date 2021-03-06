package theappbusiness;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SolutionSimple {

	public static void main(String[] args) {
		
		Integer [] array1 = {1,1,1,2,2,2,1,1,2,2,6,2,1,8};
		System.out.println(isEqual(10,Arrays.asList(array1)));
		
		Integer [] array2 = {53,800,0,0,0,356,8988,1,1};
		System.out.println(isEqual(4,Arrays.asList(array2)));
		
		Integer [] array3 ={};
		System.out.println(isEqual(0,Arrays.asList(array3)));
		
		Integer [] array4 ={1,1,1,1,1,1,1};
		System.out.println(isEqual(7,Arrays.asList(array4)));
		
		Integer [] array5 ={1,2,2,2,2,2};
		System.out.println(isEqual(6,Arrays.asList(array5)));
		
		Integer [] array6 ={1,3,1,3,3,1,1,1,3,1};
		System.out.println(isEqual(10,Arrays.asList(array6)));
		
		Integer [] array7 ={5,6};
		System.out.println(isEqual(2,Arrays.asList(array7)));
		
		Integer [] array8 = {3,1,0,2,2,3,1,2,1,1,1,2};
		System.out.println(isEqual(6,Arrays.asList(array8)));
	
	}
	
	public static boolean isEqual(int inputValue,List<Integer> inputList){
		if(inputValue==calculateLargestSlice(inputList)){
			return true;
		}
		return false;
	}
	
	
	private static Integer sumEval(Integer count1,Integer count2){
		if (count1!=null && count2!=null){
				return  count1+count2;
		} 
		else if (count1!=null && count2==null){
				return count1;
		}
		else if (count1==null && count2!=null){
			return count2;
		}
		return 0;
	}
	

	private static int calculateLargestSlice(List<Integer> inputSequence) {  
		
		Integer globalMax=0;
		Integer firstNumber=null;
		Integer secondNumber=null;
		Integer firstArrayCount=null;
		Integer secondArrayCount=null;
		Integer turn=null;
		
		for (int i=0;i<inputSequence.size();i++){
			
			Integer current=inputSequence.get(i);
			
			if (firstNumber==null){
				firstNumber=current;
				firstArrayCount=1;
				if(sumEval(firstArrayCount,secondArrayCount)>globalMax){
					globalMax=sumEval(firstArrayCount,secondArrayCount);
				}
			}
			else if (firstNumber==current){
				firstArrayCount++;
				if(sumEval(firstArrayCount,secondArrayCount)>globalMax){
					globalMax=sumEval(firstArrayCount,secondArrayCount);
				}
			}
			else if (secondNumber==null){
				secondNumber=current;
				turn=firstNumber;
				secondArrayCount=1;
				if(sumEval(firstArrayCount,secondArrayCount)>globalMax){
					globalMax=sumEval(firstArrayCount,secondArrayCount);
				}
			}
			else if (secondNumber==current){
				secondArrayCount++;
				if(sumEval(firstArrayCount,secondArrayCount)>globalMax){
					globalMax=sumEval(firstArrayCount,secondArrayCount);
				}
			}
			else if (current!=firstNumber || current!=secondNumber){
				if (firstNumber==turn){
					firstNumber=current;
					firstArrayCount=0;
					firstArrayCount++;
					turn=secondNumber;
					if(sumEval(firstArrayCount,secondArrayCount)>globalMax){
						globalMax=sumEval(firstArrayCount,secondArrayCount);
					}
				}
				else {
					secondNumber=current;
					secondArrayCount=0;
					secondArrayCount++;
					turn=firstNumber;
					if(sumEval(firstArrayCount,secondArrayCount)>globalMax){
						globalMax=sumEval(firstArrayCount,secondArrayCount);
					}
				}
			}
		}	
		return globalMax;
    }
	
	
}
