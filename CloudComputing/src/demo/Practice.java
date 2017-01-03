package demo;

import java.util.StringTokenizer;
import org.apache.hadoop.io.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice {

	public static void main(String[] args) {
		
		String address = "C:\\Users\\YasserAlejandro\\Dropbox\\MSc Computer Science Birkbeck\\AC Modules\\CloudComputing\\Lab\\temperature\\input\\temp.txt";
		
		File file = new File(address);
		
		String line;
		
		Text value = new Text();
		
		//value.

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			line=br.readLine();
		
			
			//System.out.println(line3);
			//String lastToken = "null";
			StringTokenizer s = new StringTokenizer(line,"\t");
			System.out.println(s.nextToken());
		
			
		} catch (IOException ex){
			ex.printStackTrace();
		}
		
		
		//BufferedReader bf = new BufferedReader(new FileReader(file));
		
		
		//String value = "1979   23   23   2   43   24   25   26   26   26   26   25   26  25 ";
		
		//String line = value.toString();
		
		//String lastToken = "null";
		//StringTokenizer s = new StringTokenizer(line,"\t");
		//StringTokenizer s = new StringTokenizer(line);
		
		//String year = s.nextToken();
		
		//while (s.hasMoreTokens()){
			//lastToken = s.nextToken();
		//}
		
		//System.out.println(lastToken);

	}

}
