package algorithms.maxsum;

import java.lang.Math;

public class OptSol {
	
	public int maxSum(int[] values){
		int max=0;
		if (values.length<1){
			return max;
		}
		else 
		{
			max=values[0];
			int currentValue=values[0];
			for (int i=1;i<values.length;i++){
				currentValue = Math.max(currentValue+values[i],values[i]);
				max=Math.max(currentValue,max);
			}
		}
		return max;
	}
	

}
