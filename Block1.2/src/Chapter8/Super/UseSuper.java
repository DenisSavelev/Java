package Chapter8.Super;

class A {
    int i;
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Член i в супекрклассе: " + super.i);
        System.out.println("Член i в подклассе" + i);
    }
}

public class UseSuper {
    public static void main(String[] args){
        B subOb = new B(1, 2);
        subOb.show();
    }
}
