package Chapter14.Override_methods;

class Gen<T>{
    T ob;
    Gen(T o) {
        ob = o;
    }

    T getOb() {
        System.out.print("Meтoд getob() из класса Gеп: ");
        return ob;
    }
}

class Gen2<T> extends Gen<T> {
    Gen2(T o){
        super(o);
    }

    T getOb() {
        System.out.print("Meтoд getob() из класса Gеп2: ");
        return ob;
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);
        Gen2<String> strOb2 = new Gen2<String>("Тест обобщений");
        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}
