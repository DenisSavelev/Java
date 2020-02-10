package Chapter9.Access_protection.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Конструктор базового класса");
        System.out.println("n = " + p.n);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
