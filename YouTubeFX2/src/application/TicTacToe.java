package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class TicTacToe extends Application {
	
    private final static int NO_OF_COLUMNS = 3;
    private final static int NO_OF_ROWS = 3;
    private boolean xTurn = true;

    private Button mkButton() {
        Button button = new Button();
        button.setOnAction(e -> {
            button.setText(xTurn ? "X" : "O");
            xTurn = !xTurn;
            button.setDisable(true);
        });
        return button;
    }

    @Override
    public void start(Stage stage) {

        // Add UI Controls to a scene graph root node
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Create UI Controls
        for (int x = 0; x < NO_OF_ROWS; x++)
            for (int y = 0; y < NO_OF_COLUMNS; y++) {
                grid.add(mkButton(), x, y);
            }

        // Add scene graph to stage, set stage, show
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Tic Tac Toe");
        stage.show();
    }
	
    public static void main(String[] args) {
 		launch(args);
 	}   
 		

}
