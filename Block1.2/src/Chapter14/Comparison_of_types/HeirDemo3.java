package Chapter14.Comparison_of_types;

class Gen<T>{
    T ob;
    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class Gen2<T> extends Gen<T> {
    Gen2(T o){
        super(o);
    }
}

public class HeirDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);
        Gen2<String> strOb2 = new Gen2<String>("Тест обобщений");
        if(iOb2 instanceof Gen2<?>)
            System.out.println("Объект iOb2 является экземпляром класса Gen2");
        if(iOb2 instanceof Gen<?>)
            System.out.println("Объект iOb2 является экземпляром класса Gen");
        if(strOb2 instanceof Gen2<?>)
            System.out.println("Объект strOb2 является экземпляром класса Gen2");
        if(strOb2 instanceof Gen<?>)
            System.out.println("Объект strOb2 является экземпляром класса Gen");
        System.out.println();
        if(iOb instanceof Gen2<?>)
            System.out.println("Объект iOb является экземпляром класса Gen2");
        if(iOb instanceof Gen<?>)
            System.out.println("Объект iOb является экземпляром класса Gen");
    }
}
