package Chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\n�peo�pa�o�a��e ���� int � ��� byte.");
        b = (byte) i;
        System.out.println("i � �" + i + "" + b);

        System.out.println("\n�peo�pa�o�a��e ���� double � ��� int.");
        i = (int) d;
        System.out.println("d � i" + d +"" + i);
        System.out.println("\n�peo�pa�o�a��e ���� double � ��� byte.");
        b = (byte) d;
        System.out.println("d � �" + d +" "+ b);
    }
}
