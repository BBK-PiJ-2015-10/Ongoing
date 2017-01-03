package day5.ex2dpStrategy;

public class TextStrategyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TextFormatter formatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(formatter);
        editor.publishText("Testing text in caps formatter");
        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.publishText("Testing text in lower formatter");
		
	}

}
