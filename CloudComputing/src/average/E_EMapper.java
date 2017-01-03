package average;

import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.*;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.IntWritable;

import java.io.IOException;
import java.util.StringTokenizer;


public class E_EMapper extends MapReduceBase implements 
Mapper<LongWritable, Text, Text, IntWritable> {

	@Override
	public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		
		String line = value.toString();
		String lastToken = null;
		StringTokenizer s = new StringTokenizer(line,"\t");
		//String year = s.nextToken();
		//while (s.hasMoreTokens()){
			//lastToken = s.nextToken();
		//}
		
		
		
		String innerline = s.nextToken();
		StringTokenizer s2 = new StringTokenizer(innerline);
		String year = s2.nextToken();
		
		
		
		while (s2.hasMoreTokens()){
			lastToken = s2.nextToken();
		}
		
		if (lastToken==null){
			lastToken="100";
		}
		
		int avgtemp = Integer.parseInt(lastToken);
		output.collect(new Text(year),new IntWritable(avgtemp));
		
		
	}

	
	
}
