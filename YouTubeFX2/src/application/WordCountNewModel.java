package application;

import java.io.IOException;

//import org.apache.commons.cli.Options;

public class WordCountNewModel {

	/*
	
	public static void main(String[] args) throws Exception {
		
		Configuration c = new Configuration();
		String[] files = new GenericOptionsParser(c,args).getRemainingArgs();
		Path input = new Path(files[0]);
		Path output = new Path(files[1]);
		Job j = new Job(c,"wordcount");
		j.setJarByClass(WordCountNewModel.class);
		j.setMapperClass(MapForWordCount.class);
		j.setReducerClass(ReduceForWordCount.class);
		j.setOutputKeyClass(Text.class);
		j.setOutputValueClass(IntWritable.class);
		FileInputFormat.addInputPath(j, input);
		FileOutputFormat.setOutputPath(j,output);
		System.exit(j.waitForCompletion(true)?0:1);
		
	}
	
	///*
	 
	public static class MapForWordCount extends Mapper<LongWritable,Text,Text,IntWritable> {
		public void map(LongWritable key, Text value, Context con) throws IOException,
		InterruptedException {
			
			String line = value.toString();
			String [] words = line.split(",");
			for (String word: words){
				Text outputKey = new Text(word.toUpperCase().trim());
				IntWritable outputValue = new IntWritable(1);
				con.write(outputKey,outputValue);
			}	
		}
	}
	
	public static class ReduceForWordCount extends Reducer<Text,IntWritable,Text,IntWritable> {
		
		public void reduce (Text word, Iterable<IntWritable> values, Context con) throws 
		IOException, InterruptedException {
			
			int sum =0;
			for (IntWritable value: values){
				sum +=value.get();
			}
			con.write(word,new IntWritable(sum));
		}
	}
	
	//*/

}
