package cwtwo.colors;

import com.google.inject.Singleton;

/**
 * Created by elianne on 21/02/2016.
 */

@Singleton
public class Black extends Colour {

    private static Black instance = new Black();

    private Black(){
        this.name = "Black";
    }

    public static Black getInstance(){
        return instance;
    }

}