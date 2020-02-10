package Chapter7.Access_control;

class Test {
    int a; //доступ, определяемый по умолчанию
    public int b; // открытый доступ
    private int c; // закрытый доступ
    // методы доступа к члену с данного класса
    void setc (int i) { // установить значение члена с данного класса
        c = i;
    }
        int getc() {
            return c; // получить значение члена с данного класса
        }
}

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
         //Эти операторы правильны, поэтому члены а и b
        // данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;
        //Этот оператор неверен и может вызвать ошибку
        // оЬ.с = 100; / / ОШИБКА !
        // Доступ к члену с данного класса должен осуществляться
        //с помощью методов ее класса
        ob.setc(100) ; //ВЕРНО !
        System.out.println("a, b, и с: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
