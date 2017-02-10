package pairfour;

import org.apache.hadoop.mapreduce.Reducer;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.DoubleWritable;

import java.io.IOException;
import java.lang.InterruptedException;

import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class ReducerPair extends Reducer<Text,Pair,Text,DoubleWritable> {
	
	//private Text temp1;
	
	//private Text temp2;
	
	//private Map<String,Pair> map = new HashMap();
	
	//private PriorityQueue<Pair> queue = new PriorityQueue();
	
	//private ArrayList<Pair> list = new ArrayList<Pair>();
	
	public void reduce(Text key,Iterable<Pair> values,Context context)
		throws IOException, InterruptedException {
		
		ArrayList<Text> list = new ArrayList<Text>(); 
		
		double count=1;
		for (Pair value: values){
			//temp1=value.getFirstWord();
			//temp2=value.getSecondWord();
			//list.add(temp2);
			//context.write(new Text(temp1.toString()+","+temp2.toString()),new DoubleWritable(count));
			//context.write(new Text(value.getFirstWord().toString()+","+value.getSecondWord().toString()),new DoubleWritable(count));
			//list.add(value.getSecondWord());
			count++;
		}
		for (int k=0;k<list.size();k++){
			context.write(list.get(k),new DoubleWritable(1.0));
		}
		
		
		
		/*
		
		//Map<String,Pair> map = new HashMap<String,Pair>();
		
		//PriorityQueue<Pair> queue = new PriorityQueue<Pair>();
		
		double den=0.0;
		for (Pair value: values){
			den++;
			String pairKey = value.getSecondWord().toString();
			if(map.containsKey(pairKey)){
				Pair temp = map.get(pairKey);
				temp.incCount();
				map.put(pairKey,temp);
			} else {
				map.put(pairKey,value);
			}
		}
		//queue.addAll(map.values());
		list.addAll(map.values());
		//int lcount=0;
		//for (int i=1;i<=queue.size();i++){
		//while ((queue.size()>0)){
			double len = list.size();
			context.write(new Text("the list length is"),new DoubleWritable(len));
			Pair helper = list.get(0);
			//queue.p
			//double frac =helper.getCount()/den;
			//context.write(new Text("the queue length is"),newDoubleWritable(queue.size()));
			double frac =helper.getCount();
			context.write(new Text(helper.getFirstWord().toString()+","+helper.getSecondWord().toString()),new DoubleWritable(frac));
			Pair helper2 = list.get(1);
			frac =helper2.getCount();
			context.write(new Text(helper2.getFirstWord().toString()+","+helper2.getSecondWord().toString()),new DoubleWritable(frac));
			//lcount++;
		//}
		//}	
		
		*/
		
	}
	
	
}
