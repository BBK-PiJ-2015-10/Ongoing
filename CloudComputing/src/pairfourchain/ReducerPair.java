package pairfourchain;

import org.apache.hadoop.mapreduce.Reducer;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.DoubleWritable;

import java.io.IOException;
import java.lang.InterruptedException;


public class ReducerPair extends Reducer<Text,Pair,Text,DoubleWritable> {
	
	
	public void reduce(Text key,Iterable<Pair> values,Context context)
		throws IOException, InterruptedException {
		
		double totalcount=0;
		
		for (Pair value: values){
			totalcount=totalcount+value.getCount();
		}
		
		for (Pair value: values){
			context.write(value.getSecondWord(),new DoubleWritable(value.getCount()/totalcount));
		}
		
		
		
	}
	
	
}
