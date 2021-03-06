package pairone;

import org.apache.hadoop.mapreduce.Reducer;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;

import java.io.IOException;
import java.lang.InterruptedException;

public class ReducerPair extends Reducer<Pair,IntWritable,Text,IntWritable> {

	private IntWritable result = new IntWritable();
	
	private Text fpair = new Text();
	
	
	public void reduce(Pair key,Iterable<IntWritable> values,Context context)
		throws IOException, InterruptedException {
		
		String testWord = context.getConfiguration().get("target1");
		
		String first = key.getFirstWord().toString().toLowerCase();
		String second = key.getSecondWord().toString().toLowerCase();
		
		if ( first.equals(testWord) || second.equals(testWord)){
			
			int sum=0;
			
			for (IntWritable value: values){
				sum++;
			}
			
			fpair.set((key.getFirstWord().toString()+key.getSecondWord().toString()));
			
			result.set(sum);
			context.write(fpair,result);
			
			
		}
		
		

	
	
		
	}
	
}
