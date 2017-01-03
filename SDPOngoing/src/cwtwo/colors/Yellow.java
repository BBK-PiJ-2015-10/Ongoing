package cwtwo.colors;

import com.google.inject.Singleton;

/**
 * Created by elianne on 21/02/2016.
 */

@Singleton
public class Yellow extends Colour {

    private static Yellow instance = new Yellow();

    private  Yellow(){
        this.name = "Yellow";
    }

    public static Yellow getInstance(){
        return instance;
    }

}