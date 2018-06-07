package home.factory;

import java.security.InvalidParameterException;

public class MathFunctions {
    public static double Hyperbole (double x){
        if (x==0) throw new InvalidParameterException();
        return 1/x;
    }

    public static double Hyperbole (int x){
        return Hyperbole((double)x);
    }

}