package Chapter8.Order;

class  A {
    A(){
        System.out.println("В конструкторе A.");
    }
}

class  B extends A {
    B(){
        System.out.println("В конструкторе B.");
    }
}

class  C extends B {
    C(){
        System.out.println("В конструкторе C.");
    }
}

public class CallingCons {
    public static void main(String[] args){
        C c = new C();
    }
}
