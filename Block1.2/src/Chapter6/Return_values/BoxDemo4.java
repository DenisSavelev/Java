package Chapter6.Return_values;

class Вох {
    double width;
    double height;
    double depth;
    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Вох mybox1 = new Вох();
        Вох mybox2 = new Вох();
        double vol;
        //присвоить значения переменным экземпляра myЬox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        // присвоить другие значения переменным экземпляра mуЬох2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        // получить объем первого параллелепипеда
        vol = mybox1. volume() ;
        System.out.println("Oбъeм равен " + vol);
        //получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм равен " + vol) ;
    }
}
