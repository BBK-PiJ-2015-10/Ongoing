package partitioneragegender;

import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.io.Text;

public class AgePartitioner extends Partitioner<Text,Text> {

	@Override
	public int getPartition(Text key, Text value, int numReduceTasks) {
		
		String[] str = value.toString().split("\t");
		int age = Integer.parseInt(str[2]);
		
		if (numReduceTasks ==0 || age <=20){
			return 0;
		}
		else if (age>20 && age<=30) {
			return 1 % numReduceTasks;
		}
		else {
			return 2 % numReduceTasks;
		}
	}

}
