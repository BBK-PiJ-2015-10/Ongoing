package wordoccur;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;

public class RedPrac extends Reducer<Pair,IntWritable,Text,IntWritable> {

	public void reduce(Pair key,Iterable<IntWritable> values,Context context) throws IOException
	, InterruptedException {
		
		int sum=0;
		for (IntWritable val : values){
			sum +=val.get();
		}
		context.write(new Text(key.getFirstWord()+key.getSecondWord()),new IntWritable(sum));
	}
	
	
}
