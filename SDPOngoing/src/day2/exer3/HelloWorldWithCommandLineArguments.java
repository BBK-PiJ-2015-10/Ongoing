package day2.exer3;

public class HelloWorldWithCommandLineArguments {

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println(args[0]);
		} else {
			System.out.println("Hello World from a HelloWorld with arguments!");
		}
	}
}