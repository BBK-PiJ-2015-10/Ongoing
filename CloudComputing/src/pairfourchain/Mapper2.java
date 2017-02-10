package pairfourchain;

import org.apache.hadoop.mapreduce.Mapper;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;

import java.lang.InterruptedException;
import java.io.IOException;


public class Mapper2 extends Mapper<Pair,DoubleWritable,Text,Pair> {
		
	
	public void map(Pair key,Iterable<DoubleWritable> values,Context context) throws InterruptedException, IOException {
	
		String firstTarget = context.getConfiguration().get("target1");
		
		String secondTarget = key.getSecondWord().toString();
		
		
		double count=0.0;
		for (DoubleWritable value: values){
			count++;
		}
		
		Pair temp = new Pair();
		temp.set(new Text(firstTarget),new Text(secondTarget));
		temp.setCount(count);
		
		context.write(new Text(firstTarget),temp);
			
	
		
	}
	
}
