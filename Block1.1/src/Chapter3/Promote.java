package Chapter3;

public class Promote {
    public static void main(String args[]) {
        byte Ü = 42;
        char ñ = 'à';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * Ü) + (i / ñ) - (d * s);
        System.out.println((f * Ü) + "+" + (i / ñ) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}