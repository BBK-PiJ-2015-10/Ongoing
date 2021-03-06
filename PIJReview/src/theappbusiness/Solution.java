package theappbusiness;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
		Integer [] array1 = {1,1,1,2,2,2,1,1,2,2,6,2,1,8};
		System.out.println(isEqual(10,Arrays.asList(array1)));
		
		Integer [] array2 = {53,800,0,0,0,356,8988,1,1};
		System.out.println(isEqual(4,Arrays.asList(array2)));
		
		Integer [] array3 ={};
		System.out.println(isEqual(0,Arrays.asList(array3)));
		
		Integer [] array4 ={1,1,1,1,1,1,1};
		System.out.println(isEqual(7,Arrays.asList(array4)));
		
		Integer [] array5 ={1,2,1,2,2,2};
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
	
	

	private static int calculateLargestSlice(List<Integer> inputSequence)
    {
			class Slice {
			
			Integer val1=null;
			
			Integer val2=null;
			
			Integer beg=null;
			
			Integer end=null;
			
			boolean closed=false;
			
			public Slice(){	
			}
			
			public boolean constains(int input){
				if ((val1!=null && input==val1 )|| (val2!=null && input==val2)){
					return true;
				}
				return false;
			}
			
			public boolean getClosedStatus(){
				return this.closed;
			}
			
			public boolean spaceAvailable(){
				if (val2==null){
					return true;
				}
				return false;
			}
			
			public boolean needClosing(int input){
				if (closed==true){
					return false;
				}
				else if (!this.constains(input) && val1!=null && val2!=null ){
					closed=true;
					return true;
				}	
				return false;
			}
			
			public int getSize(){
				if (beg!=null && end!=null){
					return (end-beg)+1;
				}
				return 0;
			}

			public void setVal1(Integer val1) {
					this.val1 = val1;		
			}
			
			public Integer getVal1() {
				return val1;
			}
			
			public void setVal2(Integer val2) {
				this.val2 = val2;
			}
			
			public Integer getVal2() {
				return val2;
			}

			public void setBeg(Integer beg) {
				this.beg = beg;
			}

			public void setEnd(Integer end) {
				this.end = end;
			}
			
			public String toString(){
				return "Beg index " +beg +" val1 " + val1 + 
					   " End index " +end +" val2 " + val2 +
					   " size of " +this.getSize() +
					   " closing status " +this.closed
						;
			}
				
		}
		
			
		List<Slice> slices = new ArrayList();
		
        int maxSlice=0;
        Integer prior=null;
        
		for (int i=0;i<inputSequence.size();i++){
    	   Integer value = inputSequence.get(i);
		   if (prior==null || prior!=value){
			   if (!slices.isEmpty()){
    			   for (Slice eval: slices){
        			   if (!eval.constains(value)){
        				   if (eval.spaceAvailable()){
        					   eval.setVal2(value);
        					   eval.setEnd(i);
        				   }
        				   if(eval.needClosing(value)){
        					   if(eval.getVal2()==prior){
        						   eval.setEnd(i-1);
        					   }
        				   }
        			   }
        		   }
        	   }
    		   Slice temp = new Slice();
			   temp.setVal1(value);
			   temp.setBeg(i);
    		   slices.add(temp);
    		   prior=value;
    	    }	   
       }
	   for (Slice current: slices ){
		   if ((current.getClosedStatus()==false)){
			   current.setEnd(inputSequence.size()-1);
		   }
		   if (current.getSize()>maxSlice){
			   maxSlice=current.getSize();
		   }
	   }
       return maxSlice;
    }
	
	
}
