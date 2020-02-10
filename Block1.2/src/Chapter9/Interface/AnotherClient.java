package Chapter9.Interface;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Ещё один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}
