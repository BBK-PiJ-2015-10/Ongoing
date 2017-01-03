package javafxevents;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloJfx extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		Label message = new Label("Hello, JavaFX!");
		message.setFont(new Font(100));
		stage.setScene(new Scene(message));
		stage.setTitle("Hello");
		//System.out.println("Hello hello hello");
		stage.show();
		
	}
	
	//public static void main(String[] args) {
		
		//System.out.println("I am printing something");
		
	//}
	
	
	

}
