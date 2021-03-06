package pairtwo;

import org.apache.hadoop.mapreduce.Reducer;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.DoubleWritable;

import java.io.IOException;
import java.lang.InterruptedException;

public class ReducerPair extends Reducer<Pair,IntWritable,Text,DoubleWritable> {

	private DoubleWritable result = new DoubleWritable();
	
	private Text fpair = new Text();
	
	
	public void reduce(Pair key,Iterable<IntWritable> values,Context context)
		throws IOException, InterruptedException {
		
		//String testWordSecond = context.getConfiguration().get("target2");
		
		//String first = key.getFirstWord().toString().toLowerCase();
		//String second = key.getSecondWord().toString().toLowerCase();
		
		int den=0;
		int num=0;
		
		for (IntWritable value: values){
			//den++;
			//if (second.equals(testWordSecond)){
				num++;
			//}
		}
		
		//if (second.equals(testWordSecond)){
			fpair.set((key.getFirstWord().toString()+key.getSecondWord().toString()));
			//double fraction=num/den;
			result.set(num);
			context.write(fpair,result);
		//}
		

		
	}
	
}
