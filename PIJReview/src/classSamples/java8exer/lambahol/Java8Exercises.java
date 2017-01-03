package classSamples.java8exer.lambahol;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;



import java.util.Optional;


import java.util.List;
import java.util.Arrays;

import java.util.ArrayList;


import java.util.stream.Collectors;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;



public class Java8Exercises {
	
	

	static List<String> wordList = Arrays.asList(
            "every", "problem", "in", "computer", "science",
            "can", "be", "solved", "by", "adding", "another",
            "level", "of", "indirection");
	
	static List<String> outputlist;
	
	static String outputstring;
	
	private BufferedReader reader;
	 
    static final String REGEXP = "\\W+";
	
	@Before
	public void setUp() throws IOException{
		outputlist = null;
		reader = Files.newBufferedReader(
                Paths.get("SonnetI.txt"), StandardCharsets.UTF_8);
	}
	
	@After
    public void closeBufferedReader() throws IOException {
        reader.close();
    }
	
	
	//Exer2
	@Test
	public void upperCaseWords(){
		outputlist = wordList.stream().map((n)->n.toUpperCase()).collect(Collectors.toList());
		
		assertEquals(
				Arrays.asList(
                        "EVERY", "PROBLEM", "IN", "COMPUTER", "SCIENCE",
                        "CAN", "BE", "SOLVED", "BY", "ADDING", "ANOTHER",
                        "LEVEL", "OF", "INDIRECTION"),
                outputlist);		
	}
	
	//Exer3
	@Test
	public void findEvenLenghWords(){
				
		outputlist = wordList.stream().filter(n->n.length() % 2 == 0).collect(Collectors.toList());
		
		assertEquals(
				Arrays.asList(
                        "in", "computer", "be", "solved", "by", "adding", "of"),
				outputlist);
	}
	
	//Exer4
	@Test
	public void countLinesInFile() throws IOException{
		long count = 0L;
		count = reader.lines().count();
		assertEquals(14,count);	
	}
	
	
	//Exer5
	
	public String concat (String accumulator, String input){
		accumulator = accumulator + input;
		return accumulator;
				
	}
	
	//Exercise 5
	@Test
	public void joinLineRange() throws IOException {
		outputstring = null;
		List<String> temp = null;
		//This is another approach
		String output = reader.lines().skip(2).limit(2).collect(Collectors.joining());
		temp = reader.lines().collect(Collectors.toList());
		outputstring = temp.get(2)+temp.get(3);
		
		assertEquals(
                "But as the riper should by time decease," +
                        "His tender heir might bear his memory:",
                outputstring);
				
	}

	
	
	//Exer6
	@Test
	public void lengthOfLongestLine() throws IOException {
		int longest = 0;
		longest  = reader.lines().mapToInt(n->n.length()).max().getAsInt();
		longest  = reader.lines().mapToInt(n->n.length()).sum();
		assertEquals(53,longest);
	}
	
	//Exer7
	
	
	@Test
	public void listOfAllWords() throws IOException {
		outputlist = new ArrayList<>();
		List<List<String>> temp = new ArrayList<>();
		List<String> result = new ArrayList<>();
		
		reader.lines().forEach(n->temp.add(Arrays.asList(n.split(REGEXP))));
		temp.forEach(n->n.forEach(p->outputlist.add(p)));
		
		result  = outputlist.stream().filter(n->n.length()>0).collect(Collectors.toList());
	
		
		
		assertEquals(
                Arrays.asList(
                        "From", "fairest", "creatures", "we", "desire", "increase",
                        "That", "thereby", "beauty", "s", "rose", "might", "never", "die",
                        "But", "as", "the", "riper", "should", "by", "time", "decease",
                        "His", "tender", "heir", "might", "bear", "his", "memory", "But",
                        "thou", "contracted", "to", "thine", "own", "bright", "eyes",
                        "Feed", "st", "thy", "light", "s", "flame", "with", "self",
                        "substantial", "fuel", "Making", "a", "famine", "where",
                        "abundance", "lies", "Thy", "self", "thy", "foe", "to", "thy",
                        "sweet", "self", "too", "cruel", "Thou", "that", "art", "now",
                        "the", "world", "s", "fresh", "ornament", "And", "only", "herald",
                        "to", "the", "gaudy", "spring", "Within", "thine", "own", "bud",
                        "buriest", "thy", "content", "And", "tender", "churl", "mak",
                        "st", "waste", "in", "niggarding", "Pity", "the", "world", "or",
                        "else", "this", "glutton", "be", "To", "eat", "the", "world", "s",
                        "due", "by", "the", "grave", "and", "thee"),
                result);
		
	}
	
	
	public static int wordsorter(String a, String b){
		if (a.charAt(0)<b.charAt(0))
			return -1;
		else if (a.charAt(0)>b.charAt(0)){
			return 1;
		}
		else if (a.charAt(0)==b.charAt(0) && a.length()==1 && b.length()>1 )
			return -1;
		else if (a.charAt(0)==b.charAt(0) && a.length()>1 && b.length()==1 )
			return 1;
		else if (a.length()>1 && b.length()>1) {
			return wordsorter(a.substring(1),b.substring(1));
		}
		else {
			return 0;
		}
	}
	
	
	
	//Exercise 8
	@Test
	public void sortedLowerCase() throws IOException {
		outputlist = new ArrayList<>();
		List<List<String>> temp = new ArrayList<>();
		List<String> result = new ArrayList<>();
		
		reader.lines().forEach(n->temp.add(Arrays.asList(n.split(REGEXP))));
		temp.forEach(n->n.forEach(p->outputlist.add(p)));
	
		result = outputlist.stream().filter(n->n.length()>0).map(p->p.toLowerCase()).collect(Collectors.toList());	
		result.sort((a,b)->wordsorter(a,b));
				
		assertEquals(  Arrays.asList(
                "a", "abundance", "and", "and", "and", "art", "as", "be",
                "bear", "beauty", "bright", "bud", "buriest", "but", "but",
                "by", "by", "churl", "content", "contracted", "creatures",
                "cruel", "decease", "desire", "die", "due", "eat", "else",
                "eyes", "fairest", "famine", "feed", "flame", "foe", "fresh",
                "from", "fuel", "gaudy", "glutton", "grave", "heir", "herald",
                "his", "his", "in", "increase", "lies", "light", "mak",
                "making", "memory", "might", "might", "never", "niggarding",
                "now", "only", "or", "ornament", "own", "own", "pity",
                "riper", "rose", "s", "s", "s", "s", "self", "self", "self",
                "should", "spring", "st", "st", "substantial", "sweet",
                "tender", "tender", "that", "that", "the", "the", "the",
                "the", "the", "the", "thee", "thereby", "thine", "thine",
                "this", "thou", "thou", "thy", "thy", "thy", "thy", "thy",
                "time", "to", "to", "to", "to", "too", "waste", "we", "where",
                "with", "within", "world", "world", "world"),
        result);	
	}
	
	
	public static int sortOnLengthInitial(String a, String b){
		if (a.length()<b.length())
			return -1;
		else if (a.length()>b.length())
			return 1;
		else if (a.charAt(0)<b.charAt(0))
			return -1;
	    else if (a.charAt(0)>b.charAt(0))
	    	return 1;
	    else if (a.length()>1)
	    	return sortOnLengthInitial(a.substring(1),b.substring(1));
	    else 
	    	return 0;
	}
	
	
	
	
	//Exercise 9
	
	@Test
	public void sortedLowerCaseDistinctByLengthThenAlphabetically() throws IOException {
	
		//A set can't be sorted, Hence. Maybe make all the words set. Then convert the set to a list and sort the list.
		
		outputlist = new ArrayList<>();
		List<List<String>> temp = new ArrayList<>();
		List<String> result = new ArrayList<>();
		Set<String> outputset = new HashSet<>();
		
		reader.lines().forEach(n->temp.add(Arrays.asList(n.split(REGEXP))));
		
		temp.forEach(n->n.forEach(p->outputset.add(p.toLowerCase())));
		
		outputset.forEach(n->outputlist.add(n));
		
		result = outputlist.stream().filter(n->n.length()>0).sorted((a,b)->sortOnLengthInitial(a,b)).collect(Collectors.toList());
				
		result.forEach(System.out::println);
	
        assertEquals(
                Arrays.asList(
                        "a", "s", "as", "be", "by", "in", "or", "st", "to", "we",
                        "and", "art", "bud", "but", "die", "due", "eat", "foe", "his",
                        "mak", "now", "own", "the", "thy", "too", "bear", "else",
                        "eyes", "feed", "from", "fuel", "heir", "lies", "only",
                        "pity", "rose", "self", "that", "thee", "this", "thou",
                        "time", "with", "churl", "cruel", "flame", "fresh", "gaudy",
                        "grave", "light", "might", "never", "riper", "sweet", "thine",
                        "waste", "where", "world", "beauty", "bright", "desire",
                        "famine", "herald", "making", "memory", "should", "spring",
                        "tender", "within", "buriest", "content", "decease",
                        "fairest", "glutton", "thereby", "increase", "ornament",
                        "abundance", "creatures", "contracted", "niggarding",
                        "substantial"),
                result);
	
	}
	
	
	   // Exercise 10: Categorize the words into a map, where the map's key is
    // the length of each word, and the value corresponding to a key is a
    // list of words of that length. Don't bother with uniqueness or lower-
    // casing the words.
	
	


    @Test
    @Ignore
    public void mapLengthToWordList() throws IOException {
        List<String> tester = new ArrayList<>();
        tester.add("yasser");
        tester.add("palace");
    	Map<Integer, List<String>> map = null; /* TODO */

        map.put(1, tester);
        assertEquals(6, map.get(7).size());
        assertEquals(Arrays.asList("increase", "ornament"), map.get(8));
        assertEquals(Arrays.asList("creatures", "abundance"), map.get(9));
        assertEquals(Arrays.asList("contracted", "niggarding"), map.get(10));
        assertEquals(Arrays.asList("substantial"), map.get(11));
        assertFalse(map.containsKey(12));
    }
	
	
	
	
	
}
