package average;

import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.io.Text;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;

public class E_EReducer extends MapReduceBase implements 
Reducer<Text,IntWritable,Text,IntWritable > {

	@Override
	public void reduce(Text key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		
		int maxavg = 30;
		int val = Integer.MIN_VALUE;
		
		while (values.hasNext()){
			if((val=values.next().get())>maxavg){
				output.collect(key,new IntWritable(val));
			}
			
		}
		
		
	}
	
	

}
