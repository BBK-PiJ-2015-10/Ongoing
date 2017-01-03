package weblog;

import org.apache.hadoop.mapreduce.Reducer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

import java.io.IOException;
import java.lang.InterruptedException;

public class WebLogReducer extends Reducer<WebLogWritable,IntWritable,Text,IntWritable> {

	private IntWritable result = new IntWritable();
	
	private Text ip = new Text();
	
	public void reduce(WebLogWritable key,Iterable<IntWritable> values, Context context) throws 
	IOException, InterruptedException {
		
		int sum=0;
		ip=key.getIP();
		
		for (IntWritable value : values){
			sum++;
		}
		
		result.set(sum);
		context.write(ip,result);
		
	}
}
