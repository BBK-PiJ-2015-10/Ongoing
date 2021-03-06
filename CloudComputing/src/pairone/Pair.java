package pairone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

public class Pair implements WritableComparable<Pair> {
	
	private Text firstWord;
	
	private Text secondWord;
	
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
		if (firstWord.compareTo(other.firstWord)==0){
			return secondWord.compareTo(other.secondWord);
		}
		return firstWord.compareTo(other.firstWord);
	}
	
	@Override
	public int hashCode(){
		return(firstWord.hashCode()+secondWord.hashCode());
	}
	
	@Override
	public boolean equals(Object other){
		if (other instanceof Pair){
			Pair otherp = (Pair) other;
			return (firstWord.equals(otherp.firstWord) && secondWord.equals(otherp.secondWord));
		}
		return false;
	}

	
}
