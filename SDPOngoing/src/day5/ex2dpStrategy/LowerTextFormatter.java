package day5.ex2dpStrategy;

public class LowerTextFormatter implements TextFormatter {

	@Override
	public void format(String text) {
		text = text.toLowerCase();
		System.out.println(text);
	}
	
	

}
