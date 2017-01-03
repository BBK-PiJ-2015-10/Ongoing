package day3.AdaptivePattern;

public class ConsoleLogWriter implements LogWriter {

	private ConsoleWriter consoleWriter = new ConsoleWriter();
	
	@Override
	public void out(String text) {
		consoleWriter.writeConsole(text);
		// TODO Auto-generated method stub
		
	}

}
