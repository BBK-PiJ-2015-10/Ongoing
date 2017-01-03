package cwtwo.colors;

import com.google.inject.Singleton;

/**
 * Created by elianne on 21/02/2016.
 */

@Singleton
public class Purple extends Colour {

    private static Purple instance = new Purple();

    private  Purple(){
        this.name = "Purple";
    }

    public static Purple getInstance(){
        return instance;
    }

}