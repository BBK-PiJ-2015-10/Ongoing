package debuggersample;

/*
 * Source: https://www.youtube.com/watch?v=9gAjIQc4bPU
 * Title: Using the Eclipse Debugger - Norm Krumpe
 * 
 */
public class FractionTester {

	public static void main(String[] args) {
		
		
		
		Fraction f = new Fraction(3,4);
		Fraction g = new Fraction(1/5);
		
		Fraction sum = f.add(g);
		
		Fraction[] myFractions = new Fraction[5];
		
		myFractions[0] = f;
		myFractions[1] = g;
		myFractions[4] = sum;
		
		//System.out.println(myFractions[4].toPrettyString());

	}

}
