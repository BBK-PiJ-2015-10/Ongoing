package day3.observerscratch;

import day3.observerscratch.controller.Controller;
import day3.observerscratch.model.Model;
import day3.observerscratch.view.View;

import javax.swing.SwingUtilities;

public class Application {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                runApp();
            }

        });
    }

    public static void runApp() {
        Model model = new Model();
        View view = new View(model);

        Controller controller = new Controller(view, model);

        //We could have had a list of listeners, in this case we only have controller as
        //the only listener. If a loggin even occurs in the view tell the controller.
        
        view.setLoginListener(controller);
    }

}
