package day5.ex2dpStrategy;

public class TextEditor {

	private TextFormatter textformatter;
	
	public TextEditor (TextFormatter textformatter){
		this.textformatter=textformatter;
	}
	
	public void publishText(String text){
		textformatter.format(text);
	}
	
	public void setTextFormatter(TextFormatter textformatter){
		this.textformatter=textformatter;
	}
	
	
	
}
