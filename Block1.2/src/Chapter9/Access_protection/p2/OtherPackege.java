package Chapter9.Access_protection.p2;

public class OtherPackege {
    OtherPackege() {
        Chapter9.Access_protection.p1.Protection p = new Chapter9.Access_protection.p1.Protection();
        System.out.println("Конструктор из другого пакета");
        System.out.println("n_pub " + p.n_pub);
    }
}
