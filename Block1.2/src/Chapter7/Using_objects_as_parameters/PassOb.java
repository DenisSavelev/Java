package Chapter7.Using_objects_as_parameters;

class Test {
    int a, b;
    Test(int i, int j){
        a = i;
        b = j;
    }
    // возвратить логич еское значение true, е сли в кач е с т в е
    // параме тра о ука зан вызывающий объект
    public boolean equals(Test o) {
        return o.a == a && o.b == b;
    }
}

public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22 );
        Test ob2 = new Test(100, 22 );
        Test ob3 = new Test(-1, -1 );
        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));
    }
}
