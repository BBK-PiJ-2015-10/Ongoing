package pairfourchain;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.lang.InterruptedException;
import java.lang.ClassNotFoundException;

import org.apache.hadoop.mapreduce.lib.chain.ChainMapper;
import org.apache.hadoop.mapreduce.lib.chain.ChainReducer;

public class PairDriver {

	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
		
		//Count how many times I see alberto
		//Count how many times I see alberto followed by palacios
		
		Configuration conf = new Configuration();
		conf.set("target1","alberto");
		
		Job job = new Job(conf,"PairDriver");
		
		FileInputFormat.addInputPath(job,new Path(args[0]));
		FileOutputFormat.setOutputPath(job,new Path(args[1]));
		
		Configuration map1conf = new Configuration(false);
		ChainMapper.addMapper(job,Mapper1.class,LongWritable.class,Text.class,Pair.class,DoubleWritable.class,map1conf);
		
		Configuration map2conf = new Configuration(false);
		ChainMapper.addMapper(job,Mapper2.class,Pair.class,DoubleWritable.class,Text.class,Pair.class,map2conf);
		
		Configuration redconf = new Configuration(false);
		ChainReducer.setReducer(job,ReducerPair.class,Text.class,Pair.class,Text.class,DoubleWritable.class,redconf);
		
		
		job.setJarByClass(PairDriver.class);
				
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(DoubleWritable.class);
			
		
		job.waitForCompletion(true);
		
	

	}

}
