package pairthree;

import org.apache.hadoop.mapreduce.Reducer;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.DoubleWritable;

import java.io.IOException;
import java.lang.InterruptedException;

public class ReducerPair extends Reducer<Text,Pair,Text,DoubleWritable> {

	private DoubleWritable result = new DoubleWritable();
	
	private Text fpair = new Text();
	
	
	public void reduce(Text key,Iterable<Pair> values,Context context)
		throws IOException, InterruptedException {
		
		String firstTarget = context.getConfiguration().get("target1");
		String secondTarget = context.getConfiguration().get("target2");
				
		double den=0;
		double num=0;
		
		for (Pair value: values){
			if (value.isEmpty()){
				den++;
			}
			else {
				num++;
			}
		}
		
		double fraction=num/den;
		result.set(fraction);
		
		context.write(new Text(firstTarget+","+secondTarget),result);
		
	
		

		
	}
	
}
