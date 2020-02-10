package Chapter14.Bridge_methods;

class Gen<T>{
    T ob;
    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class Gen2<T> extends Gen<String> {
    Gen2(String o){
        super(o);
    }

    String getob() {
        System.out.print("Вызван метод String getob(): ");
        return ob;
    }
}

public class BridgeDemo {
    public static void main(String[] args) {
        Gen2 strOb2 = new Gen2("Тест обобщений");
        System.out.println(strOb2.getob());
    }
}
