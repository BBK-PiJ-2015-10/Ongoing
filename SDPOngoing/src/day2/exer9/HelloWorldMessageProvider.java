package day2.exer9;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World from Spring with DI XML File!";
    }

}