package wordoccur;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.IntWritable;

import java.util.List;
import java.util.LinkedList;


public class MapPrac extends Mapper<LongWritable,Text,Pair,IntWritable> {
	
	//This is creating an IntWritable with a value of 1
	private final static IntWritable one = new IntWritable(1);
	
	//This is the hadoop equivalent of a String
	private Text word = new Text();
	
	//Regular expression to assist in the elimination of anything that is not a word
	private String pattern = "^[a-z][a-z0-9]*$";
	
	private List<String> words = new LinkedList();
	
	public void map(LongWritable key,Text value,Context context) throws IOException, InterruptedException{
		
		//String testWord = context.getConfiguration().get("target1");
		
		//Taking one line at a time
		String line = value.toString();
		
		//takenizing the line
		StringTokenizer tokenizer = new StringTokenizer(line);
		
		String currentWord;
		
		while(tokenizer.hasMoreTokens()){
			currentWord = tokenizer.nextToken().toLowerCase();
			if (currentWord.matches(pattern)){
				words.add(currentWord);
			}
		}
		
		for (int i=0;i<words.size()-1;i++){
			Pair temp = new Pair(words.get(i),words.get(i+1));
			context.write(temp,one);
		}
		
	}
}
