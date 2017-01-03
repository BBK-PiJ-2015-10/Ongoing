package day3.mvc.controller;


import day3.mvc.model.Model;
import day3.mvc.view.View;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }
}
