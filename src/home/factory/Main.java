package home.factory;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nStarted.. ");

        while (true){
            Double input = readDoubleFromConsole();
            calculateAndPrintHyperbole(input);
        }
    }

    private static void calculateAndPrintHyperbole(Double input) {
        MathFunctions myMath = new MathFunctions();
        if (input == 0){
            System.out.println("Value 0 is not allowed for current function.");
            return;
        }
        System.out.println("Result is " + myMath.Hyperbole(input));
    }

    private static Double readDoubleFromConsole() {
        Console console = System.console();
        while (true){
            try{
                System.out.print("\nEnter x:  ");

                Scanner terminalInput = new Scanner(System.in);
                String input = terminalInput.nextLine();

                Double result = Double.parseDouble(input);
                return result;
            } catch (Exception e) {
                System.out.println("Wrong input data. Double value expected.");
            }
        }
    }
}
