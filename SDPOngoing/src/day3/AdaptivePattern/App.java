package day3.AdaptivePattern;

public class App {

	public static void main(String[] args) {
		
		///Composition
		
		ConsoleLogWriter logWriter = new ConsoleLogWriter();
		
		Logger logger = new Logger(logWriter);
		
		logger.write("Hello There");
		
		//Inheritance
		
		ConsoleLogWriter logWriter2 = new ConsoleLogWriter();
		
		Logger logger2 = new Logger(logWriter);
		
		logger2.write("Hello There # 2");
		
		
		
		
		
		
		

	}

}
