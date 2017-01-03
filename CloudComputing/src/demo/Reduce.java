package demo;

import java.lang.Iterable;
import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


public class Reduce extends Reducer<Text,IntWritable,Text,IntWritable> {

	@Override
	protected void reduce(Text key,Iterable<IntWritable> values,Context con)
	throws IOException, InterruptedException {
	
		int sum =0;
		for (IntWritable value: values){
			sum +=value.get();
		}
		con.write(key,new IntWritable(sum));
		
	}
	
	
}
