package javafxevents;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJfxButtons extends Application {
	
	private int count = 0;

	@Override
	public void start(Stage stage) throws Exception {
		
		Label counterLabel = new Label("Count: 0");
		Button incButton = new Button("Increment Count");
		incButton.setOnAction(event -> counterLabel.setText("Count: " +(++count)));
		
		VBox root = new VBox();
		root.getChildren().addAll(counterLabel,incButton);
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.setTitle("Hello");
		stage.show();
		
		
	}
	
	//public static void main(String[] args) {
	
		//	System.out.println("I am printing something else");
			
	//}
	
	

}
