package pairfour;

import org.apache.hadoop.mapreduce.Mapper;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;

import java.lang.InterruptedException;
import java.io.IOException;


public class MapperTupple extends Mapper<LongWritable,Text,Text,Pair> {
		
	private Text first = new Text();
	
	private Text second = new Text();
	
	private String pattern = "^[a-z][a-z0-9]*$";
	
	public void map(LongWritable key,Text value,Context context) throws InterruptedException, IOException {
		
		String firstTarget = context.getConfiguration().get("target1");
				
		//Taking one line at a time
		String line = value.toString();
			
		//takenizing the line
		StringTokenizer tokenizer = new StringTokenizer(line);
		
		List<String> words = new LinkedList();
		
		String currentWord;
			
		while(tokenizer.hasMoreTokens()){
			currentWord = tokenizer.nextToken().toLowerCase();
			if (currentWord.matches(pattern)){
				words.add(currentWord);
			}
		}
		
	
		for (int i=0;i<words.size()-1;i++){
			if (words.get(i).equals(firstTarget)) {	
					Pair pair = new Pair();
					first.set(words.get(i));
					second.set(words.get(i+1));
					pair.set(first,second);
					context.write(new Text(firstTarget),pair);
			}
		}
		
	}
	
}
