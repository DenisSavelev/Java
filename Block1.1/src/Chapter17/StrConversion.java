package Chapter17;

public class StrConversion {
    public static void main(String[] args) {
        int num = 19648;
        System.out.println("Число "+num + " в двоичной форме: " + Integer.toBinaryString(num));
        System.out.println("Число "+num + " в двоичной форме: " + Integer.toOctalString(num));
        System.out.println("Число "+num + " в двоичной форме: " + Integer.toHexString(num));
    }
}
