package Chapter8.Abstract_class;

abstract class A {
    abstract  void callme();

    void callmetoo() {
        System.out.println("Это конкретный метод.");
    }
}

class B extends A {
    void callme(){
        System.out.println("Реализация метода callme() из класса B.");
    }
}

public class AbstractDemo {
    public static void main(String[] args){
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}
