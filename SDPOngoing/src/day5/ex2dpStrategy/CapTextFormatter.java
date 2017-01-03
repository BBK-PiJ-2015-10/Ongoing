package day5.ex2dpStrategy;

public class CapTextFormatter implements TextFormatter {

	@Override
	public void format(String text) {
		text = text.toUpperCase();
		System.out.println(text);
	}

	
	
}
