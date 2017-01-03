package weblog;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.Text;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;


public class WebLogWritable implements WritableComparable<WebLogWritable> {
	
	private Text siteURL,reqDate,timestamp,ipaddress;
	
	private IntWritable reqNo;
	
	public void set(IntWritable repNo,Text siteURL,Text reqDate, Text timestamp, Text ipaddress){
		this.siteURL = siteURL;
		this.reqDate = reqDate;
		this.timestamp = timestamp;
		this.ipaddress = ipaddress;
		this.reqNo = repNo;
	}
	

	public WebLogWritable(Text siteURL, Text reqDate, Text timestamp, Text ipaddress, IntWritable repNo) {
		this.siteURL = siteURL;
		this.reqDate = reqDate;
		this.timestamp = timestamp;
		this.ipaddress = ipaddress;
		this.reqNo = repNo;
	}
	
	public WebLogWritable(){
		this.siteURL = new Text();
		this.reqDate = new Text();
		this.timestamp = new Text();
		this.ipaddress = new Text();
		this.reqNo = new IntWritable();
	}
	
	public Text getIP(){
		return this.ipaddress;
	}
	
	@Override
	public void readFields(DataInput in) throws IOException {
		ipaddress.readFields(in);
		timestamp.readFields(in);
		reqDate.readFields(in);
		reqNo.readFields(in);
		siteURL.readFields(in);
	}
	
	
	@Override
	public void write(DataOutput out) throws IOException {
		ipaddress.write(out);
		timestamp.write(out);
		reqDate.write(out);
		reqNo.write(out);
		siteURL.write(out);
	}

	@Override
	public int compareTo(WebLogWritable other) {
		if (ipaddress.compareTo(other.ipaddress)==0){
			return (timestamp.compareTo(other.timestamp));
		}
		else 
		{
			return ipaddress.compareTo(other.ipaddress);
		}	
	}
	
	@Override
	public boolean equals(Object othero){
		if (othero instanceof WebLogWritable){
			WebLogWritable other = (WebLogWritable) othero;
			return (ipaddress.equals(other.ipaddress) &&
				   timestamp.equals(other.timestamp));	
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return ipaddress.hashCode();
	}

	
}
