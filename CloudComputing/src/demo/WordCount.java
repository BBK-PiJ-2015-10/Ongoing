package demo;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.*;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.*;

public class WordCount {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	, InterruptedException {
		
		Configuration conf = new Configuration();
		
		Path input=new Path(args[0]);
		Path output=new Path(args[1]);
		
		Job job = new Job(conf,"wordcount");
		job.setJarByClass(WordCount.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		job.setMapperClass(Map.class);
		job.setReducerClass(Reduce.class);
		
		//job.setInputFormatClass(TextInputFormat.class);
		//job.setOutputFormatClass(TextOutputFormat.class);
		////job.setInputFormatClass(FileInputFormat.class);
		////job.setOutputFormatClass(FileOutputFormat.class);
		//FileInputFormat.addInputPath(job, new Path(args[0]));
		//FileOutputFormat.setOutputPath(job,new Path(args[1]));

		
		FileInputFormat.addInputPath(job,input);
		FileOutputFormat.setOutputPath(job,output);
		
		job.waitForCompletion(true);
		

	}

}
