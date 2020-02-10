package Chapter9.Access_protection.p2;

public class Protection2 extends  Chapter9.Access_protection.p1.Protection{
    Protection2() {
        System.out.println("Конструктор, унаследованный из другого класса");
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
