package day2.exer8;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {

        return "Hello World from Message provider with DI!";
    }

}