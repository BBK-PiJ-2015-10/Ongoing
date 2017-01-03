package day3.observerscratch.controller;

import day3.observerscratch.model.Model;
import day3.observerscratch.view.LoginFormEvent;
import day3.observerscratch.view.LoginListener;
import day3.observerscratch.view.View;

public class Controller implements LoginListener {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());

    }
}
