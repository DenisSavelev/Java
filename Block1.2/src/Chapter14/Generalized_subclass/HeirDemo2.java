package Chapter14.Generalized_subclass;

class NonGen {
    int num;

    NonGen(int i){
        num = i;
    }

    int getnum() {
        return num;
    }
}

class Gen<T> extends NonGen {
    T ob;
    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

public class HeirDemo2 {
    public static void main(String[] args) {
        Gen<String> w = new Gen<>("Добро пожаловать", 47);
        System.out.print(w.getOb() + " ");
        System.out.println(w.getnum());
    }
}
