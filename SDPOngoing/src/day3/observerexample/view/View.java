package day3.observerexample.view;

import day3.observerexample.model.Model;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {

    private Model model;
    private JButton helloButton;
    private JButton goodbyeButton;

    public View(Model model) {
        super("MVC Demo");

        this.model = model;

        helloButton = new JButton("Hello!");
        goodbyeButton = new JButton("Goodbye!");

        //This is to design your layout.
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        add(helloButton, gc);

        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        add(goodbyeButton, gc);

        //This is adding a list of Listeners or observers of these buttons. Action
        //Listener is an interface. We are passing a reference to a View object, that's why
        //you see the (this).
        //They both have the same listener.
        
        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        //This is an example on how to pass an annonimous class.
        //add implies multiple listeners. Instead of a simple set.
        goodbyeButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sorry to see you go.");
            }

        });

        //This is to turn the program into a window.
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    
    //Notice that you are passing e as an event. getSource() will you what's the
    //the source.
    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton) e.getSource();

        if (source == helloButton) {
            System.out.println("Hello there!");
        } else {
            System.out.println("Some other button.");
        }

    }


}
