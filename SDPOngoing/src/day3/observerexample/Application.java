package day3.observerexample;

import day3.observerexample.controller.Controller;
import day3.observerexample.model.Model;
import day3.observerexample.view.View;

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
    }

}
