package cwtwo.colors;

/**
 * Created by elianne on 21/02/2016.
 */

//@Singleton
public class Blue extends Colour {

    private static Blue instance = new Blue();

    private Blue(){
        this.name = "Blue";
    }

    public static Blue getInstance(){
        return instance;
    }

}
