package cwtwo.colors;

import com.google.inject.Singleton;

/**
 * Created by elianne on 21/02/2016.
 */

@Singleton
public class White extends Colour {

    private static White instance = new White();

    private  White(){
        this.name = "White";
    }

    public static White getInstance(){
        return instance;
    }

}