package Chapter3;

public class Promote {
    public static void main(String args[]) {
        byte � = 42;
        char � = '�';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * �) + (i / �) - (d * s);
        System.out.println((f * �) + "+" + (i / �) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}