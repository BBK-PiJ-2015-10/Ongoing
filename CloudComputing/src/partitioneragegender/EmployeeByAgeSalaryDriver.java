package partitioneragegender;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.lang.InterruptedException;
import java.lang.ClassNotFoundException;

public class EmployeeByAgeSalaryDriver {

	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException  {
		/*
		 * This is an application that takes an input file and calculates
		 * the max salary by age for each gender group
		 */
		

		Configuration conf = new Configuration();
		
		
		Job job = new Job(conf,"topsal");
		job.setJarByClass(EmployeeByAgeSalaryDriver.class);
		
		job.setMapperClass(GenderMapper.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(Text.class);
		
		//set partitioner statetements
		
		job.setPartitionerClass(AgePartitioner.class);
		job.setReducerClass(FinalCounter.class);
		job.setNumReduceTasks(3);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
				
		FileInputFormat.addInputPath(job,new Path(args[0]));
		FileOutputFormat.setOutputPath(job,new Path(args[1]));
		
		job.waitForCompletion(true);
		
		
	}

}
