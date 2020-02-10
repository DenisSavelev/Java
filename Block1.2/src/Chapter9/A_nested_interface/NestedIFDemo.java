package Chapter9.A_nested_interface;

class A {
    public interface NestedIF {
        boolean isNotNegative (int x);
    }
}

class B implements A.NestedIF {
    public boolean isNotNegative (int x) {
        return x < 0 ? false : true;
    }
}

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("Число 10 неотрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Это не будет выведено");
    }
}
