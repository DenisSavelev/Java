package Chapter7.Features_of_argument_passing;

class Test1 {
    int a, b;

    Test1(int i, int j){
        a = i;
        b = j;
    }
    void meth(Test1 o){
        o.a *= 2;
        o.b /= 2;
    }
}

public class PassObjRe {
    public static void main(String[] args) {
        Test1 ob = new Test1(15, 20);
        System.out.println("a и Ь до вызова : "  + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("a и Ь после вызова : " + ob.a + " " + ob.b);
    }
}
