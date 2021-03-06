package partitioneragegender;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.lang.InterruptedException;
import java.io.IOException;

public class GenderMapper extends Mapper<LongWritable,Text,Text,Text> {

	public void map(LongWritable key, Text value, Context context) throws InterruptedException, IOException{
		
		String[] str = value.toString().split("\t",-3);
		String gender = str[3];
		context.write(new Text(gender),new Text(value));
		
	}
	
}
