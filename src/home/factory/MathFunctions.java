package home.factory;

import java.lang.reflect.Array;
import java.security.InvalidParameterException;

public class MathFunctions {
    public static double Hyperbole (double x){
        if (x==0) throw new InvalidParameterException();
        return 1/x;
    }

    public static double Hyperbole (int x){
        return Hyperbole((double)x);
    }

    public static String RemoveSymbols(String input, int amount, char symbol){
        char[] work = input.toCharArray();
        String result = "";
        int counter=1;
        for (int i=input.length()-1; i>=0; i--){
            if (counter<=amount && work[i] == symbol)
                counter++;
            else result+=work[i];
        }
        return InvertDuplication(result);
    }

    public static String Invert1 (String str){
        int stepsAmount = str.length()/2;
        int length = str.length();
        String[] strArray = str.split("");
        for (int i=0; i<stepsAmount; i++){
            String symbol=strArray[i];
            strArray[i] = strArray[length - 1 -i];
            strArray[length - 1 -i] = symbol;
        }
        String result="";
        for (String item: strArray){
            result+=item;
        }
        return result;
    }

    public static String Invert2 (String str){
        int stepsAmount = str.length()/2;
        int length = str.length();
        char[] strInChar= str.toCharArray();
        for (int i=0; i<stepsAmount; i++){
            char symbol=strInChar[i];
            strInChar[i] = strInChar[length - 1 -i];
            strInChar[length - 1 -i] = symbol;
        }
        String result="";
        for (char item: strInChar){
            result+=item;
        }
        return result;
    }

    public static String InvertDuplication (String str){
        String result="";
        for (int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        return result;
    }

    public static String[] StringArrayInversionForEach(String[] array){
        for (int i=0; i< array.length; i++)
            array[i]=InvertDuplication(array[i]);
        return array;
    }
}