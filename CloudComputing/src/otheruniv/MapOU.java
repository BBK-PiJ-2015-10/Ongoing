package otheruniv;

import java.io.IOException;
import java.util.*;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Mapper;


public class MapOU extends Mapper<LongWritable, Text, Text, IntWritable> {

    private final static IntWritable one = new IntWritable(1);
    
    private Text word = new Text();
    
    private String pattern= "^[a-z][a-z0-9]*$";
        
    
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        StringTokenizer tokenizer = new StringTokenizer(line);
        while (tokenizer.hasMoreTokens()) {
            word.set(tokenizer.nextToken());
            String stringWord = word.toString().toLowerCase();
        	//String stringWord = tokenizer.nextToken();
            
            if (stringWord.matches(pattern)){
                context.write(new Text(stringWord), one);
            }
            
        }
    }	
	
	
	
	
	
}
