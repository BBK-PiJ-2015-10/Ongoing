package classSamples.generics;

import java.util.Arrays;

public class GenericListPrint {
	
	public static <E> void printArray( E[] inputArray){
		
		Arrays.stream(inputArray).forEach(n->System.out.print(' ' +n.toString()));
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		Integer[] intarray = {1,2,3,4};
		String[] stringarray = {"bibio","mimason","tontolone"};
		Character[] characarray = {'y','a','s','s','e','r'};
		
		
		printArray(intarray);
		printArray(stringarray);
		printArray(characarray);
		
		// TODO Auto-generated method stub

	}

}
