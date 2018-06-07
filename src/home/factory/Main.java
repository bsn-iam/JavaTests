package home.factory;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nStarted..");
        MathFunctions Math = new MathFunctions();

        System.out.println("f(-10) = " + Math.Hyperbole(-10));
        System.out.println("f(-1054643) = " + Math.Hyperbole(-1054643));
        System.out.println("f(50) = " + Math.Hyperbole(50.565));

    }
}
