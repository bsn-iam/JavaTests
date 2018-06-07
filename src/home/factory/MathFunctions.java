package home.factory;

import java.security.InvalidParameterException;

public class MathFunctions {
    public double Hyperbole (double x){
        if (x==0) throw new InvalidParameterException();
        return 1/x;
    }

    public double Hyperbole (int x){
        return Hyperbole((double)x);
    }

}