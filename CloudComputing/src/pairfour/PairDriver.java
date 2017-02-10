package pairfour;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.lang.InterruptedException;
import java.lang.ClassNotFoundException;

public class PairDriver {

	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
		
		//Count how many times I see alberto
		//Count how many times I see alberto followed by palacios
		
		Configuration conf = new Configuration();
		conf.set("target1","alberto");
		
		Job job = new Job(conf,"PairDriver");
		
		
		job.setJarByClass(PairDriver.class);
		
		job.setMapperClass(MapperTupple.class);
		job.setReducerClass(ReducerPair.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(DoubleWritable.class);
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(Pair.class);
		
		FileInputFormat.addInputPath(job,new Path(args[0]));
		FileOutputFormat.setOutputPath(job,new Path(args[1]));
		
		job.waitForCompletion(true);
		
	

	}

}
