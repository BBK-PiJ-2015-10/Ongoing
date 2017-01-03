package day2.exer7;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {

        return "Hello World from a Simple Spring!";
    }

}