package wordoccur;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Writable;


import java.util.StringTokenizer;


public class Pair implements Writable, Comparable<Pair>{
	
	private String firstWord;
	
	private String secondWord;

	public Pair(String firstWord, String secondWord) {
		this.firstWord = firstWord;
		this.secondWord = secondWord;
	}

	public String getFirstWord() {
		return firstWord;
	}

	public void setFirstWord(String firstWord) {
		this.firstWord = firstWord;
	}

	public String getSecondWord() {
		return secondWord;
	}

	public void setSecondWord(String secondWord) {
		this.secondWord = secondWord;
	}
	
	@Override
	public int hashCode(){
		String temp=firstWord+secondWord;
		return temp.hashCode();
	}
	
	
	@Override
	public boolean equals(Object object2){
		if(object2 instanceof Pair){
			Pair temp = (Pair)object2;
			if ( (temp.getFirstWord().equals(this.getFirstWord())) && 
			   (temp.getSecondWord().equals(this.getSecondWord())) ){
				return true;
			}
		}
		return false;
	}
	

	@Override
	public void readFields(DataInput in) throws IOException {
		String temp = in.readUTF();
		StringTokenizer tokenizer = new StringTokenizer(temp);
		firstWord = tokenizer.nextToken();
		secondWord = tokenizer.nextToken();	
	}

	@Override
	public void write(DataOutput out) throws IOException {
		out.writeUTF(firstWord);
		out.writeUTF(secondWord);
	}
	
	
	@Override
	public int compareTo(Pair other) {
		if (firstWord.compareTo(other.firstWord)==0){
			return secondWord.compareTo(other.secondWord);
		}
		return firstWord.compareTo(other.secondWord);
	}
	
	

}
