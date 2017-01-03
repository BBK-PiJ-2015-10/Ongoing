package practice;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.IntWritable;


public class MapPrac extends Mapper<LongWritable,Text,Text,IntWritable> {
	
	//This is creating an IntWritable with a value of 1
	private final static IntWritable one = new IntWritable(1);
	
	//This is the hadoop equivalent of a String
	private Text word = new Text();
	
	//Regular expression to assist in the elimination of anything that is not a word
	private String pattern = "^[a-z][a-z0-9]*$";
	
	public void map(LongWritable key,Text value,Context context) throws IOException, InterruptedException{
		
		//Taking one line at a time
		String line = value.toString();
		
		//takenizing the line
		StringTokenizer tokenizer = new StringTokenizer(line);
		
		//iterating through all the words available in that line and forming the key value pair
		while(tokenizer.hasMoreTokens()){	
			String inputWord = tokenizer.nextToken().toLowerCase();
			if (inputWord.matches(pattern)){
				context.write(new Text(inputWord),one);
			}
			
		}
		
	}
}
