package day3.observerexample.controller;

import day3.observerexample.model.Model;
import day3.observerexample.view.View;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }


}
