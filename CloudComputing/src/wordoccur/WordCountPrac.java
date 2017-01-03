package wordoccur;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.Job;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;

import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import org.apache.hadoop.fs.Path;
import java.io.IOException;

import java.util.List;
import java.util.LinkedList;

public class WordCountPrac {

	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
		
		
		Configuration conf = new Configuration();
		
		conf.set("target1","yasser");
	
		Job job = new Job(conf,"WordCountPrac");
		job.setJarByClass(WordCountPrac.class);
		
		job.setMapperClass(MapPrac.class);
		job.setReducerClass(RedPrac.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		job.setMapOutputKeyClass(Pair.class);
		job.setMapOutputValueClass(IntWritable.class);
				
		FileInputFormat.addInputPath(job,new Path(args[0]));
		FileOutputFormat.setOutputPath(job,new Path(args[1]));
		
		job.waitForCompletion(true);
			

	}

}