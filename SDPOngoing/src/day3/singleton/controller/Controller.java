package day3.singleton.controller;

import day3.singleton.model.Model;
import day3.singleton.view.LoginFormEvent;
import day3.singleton.view.LoginListener;
import day3.singleton.view.View;

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
