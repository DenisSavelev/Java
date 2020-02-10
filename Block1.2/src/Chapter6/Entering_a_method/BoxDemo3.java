package Chapter6.Entering_a_method;

class Вох {
    double width;
    double height;
    double depth;
    // вывести объем параллелепипеда
    void volume() {
        System.out.print("Oбъeм равен ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Вох mybox1 = new Вох() ;
        Вох mybox2 = new Вох() ;
        //присвоить значения переменным экземпляра myЬox1
        mybox1.width = 10 ;
        mybox1.height = 20 ;
        mybox1.depth = 15 ;
        // присвоить другие значения переменным экземпляра mуЬох2
        mybox2.width = 3;
        mybox2. height = 6;
        mybox2.depth = 9;
        // вывести объем первого параллелепипеда
        mybox1.volume();
        //вывести объем второго параллелепипеда
        mybox2.volume();
    }
}
