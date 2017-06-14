package debuggersample;

public class Fraction {
	
	private int numerator;
	
	private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction(int numerator) {
		this(numerator,1);
	}
	
	public Fraction add(Fraction that){
		int num = this.numerator*that.denominator +
				  this.denominator*that.numerator;
		int den = this.denominator * that.denominator;
		Fraction sum = new Fraction(num,den);
		return sum;
	}
	
	
	

}
