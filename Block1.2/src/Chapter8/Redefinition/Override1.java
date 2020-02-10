package Chapter8.Redefinition;

class A1 {
    int i, j;
    A1 (int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B1 extends A1 {
    int k;
    B1(int a, int b, int c){
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}


public class Override1 {
    public static void main(String[] args){
        B1 subOb = new B1(1, 2, 3);
        subOb.show("Это k: ");
        subOb.show();
    }
}

