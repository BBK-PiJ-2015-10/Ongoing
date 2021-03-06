package partitioneragegender;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;

import org.apache.hadoop.mapreduce.Reducer;
import java.lang.InterruptedException;
import java.io.IOException;

public class FinalCounter extends Reducer<Text,Text,Text,IntWritable> {

	//public int max =-1;
	
	public void reduce(Text key,Iterable<Text> values,Context context) throws IOException, InterruptedException{
		
		int max =-1;
		for (Text val : values){
			String[] str = val.toString().split("\t",-3);
			if (Integer.parseInt(str[4])>max){
				max=Integer.parseInt(str[4]);
			}
		}
		context.write(new Text(key),new IntWritable(max));
	}
	
}
