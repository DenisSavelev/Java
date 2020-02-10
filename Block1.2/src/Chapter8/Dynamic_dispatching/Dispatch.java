package Chapter8.Dynamic_dispatching;

class A {
    void callme(){
        System.out.println("В методе callme() из класса A");
    }
}

class B extends A {
    void callme(){
        System.out.println("В методе callme() из класса B");
    }
}

class C extends A {
    void callme(){
        System.out.println("В методе callme() из класса C");
    }
}

public class Dispatch {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
