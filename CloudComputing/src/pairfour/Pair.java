package pairfour;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

public class Pair implements WritableComparable<Pair> {
	
	private Text firstWord;
	
	private Text secondWord;
	
	private Double count=0.0;
	
	public Pair(Text firstWord, Text secondWord) {
		this.firstWord = firstWord;
		this.secondWord = secondWord;
	}
	
	public Pair(){
		firstWord = new Text();
		secondWord = new Text();
	}
	
	public void set(Text first, Text second){
		this.firstWord=first;
		this.secondWord=second;
	}
	
	public void incCount(){
		count++;
		
	}
	
	public double getCount(){
		return this.count;
	}
	
	public Text getFirstWord() {
		return firstWord;
	}

	public Text getSecondWord() {
		return secondWord;
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		firstWord.readFields(in);
		secondWord.readFields(in);
	}

	@Override
	public void write(DataOutput out) throws IOException {
		firstWord.write(out);
		secondWord.write(out);
	}

	@Override
	public int compareTo(Pair other) {
		return -(this.count.compareTo(other.count));
	}
	
	@Override
	public int hashCode(){
		int prime =31;
		int result =1;
		result = prime * result * firstWord.toString().hashCode();
		result = result * secondWord.toString().hashCode();
		return result;
	}
	
	@Override
	public boolean equals(Object other){
		if (other instanceof Pair){
			Pair otherp = (Pair) other;
			return (firstWord.toString().equals(otherp.firstWord.toString()) && secondWord.toString().equals(otherp.secondWord.toString()));
		}
		return false;
	}
	
	


	
}
