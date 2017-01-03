package average;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;


public class AverageTemp {

	public static void main(String[] args) throws Exception {
				
		JobConf conf = new JobConf(AverageTemp.class);
		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(IntWritable.class);
		conf.setMapperClass(E_EMapper.class);
		conf.setCombinerClass(E_EReducer.class);
		conf.setReducerClass(E_EReducer.class);
		conf.setInputFormat(TextInputFormat.class);
		conf.setOutputFormat(TextOutputFormat.class);
		
		Path p1 = new Path(args[0]);
		Path p2 = new Path(args[1]);
		
		FileInputFormat.setInputPaths(conf,p1);
		FileOutputFormat.setOutputPath(conf,p2);
		
		JobClient.runJob(conf);
				
	}

}
