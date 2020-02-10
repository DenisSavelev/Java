package Chapter14.Generalized_class;

class TwoGen<T, V> {
    T ob1;
    V ob2;
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }

    void showTypes() {
        System.out.println("Типом Т: " + ob1.getClass().getName());
        System.out.println("Типом V: " + ob2.getClass().getName());
    }
}

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Обобщения");
        tgObj.showTypes();
        int v = tgObj.getob1();
        System.out.println("Значение: " + v);

        String str = tgObj.getob2();
        System.out.println("Значение: " + str);
    }
}
