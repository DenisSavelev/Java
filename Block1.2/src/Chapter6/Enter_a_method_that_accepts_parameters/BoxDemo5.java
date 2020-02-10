package Chapter6.Enter_a_method_that_accepts_parameters;

class Вох {
    double width;
    double height;
    double depth;
    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
    // установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        Вох mybox1 = new Вох();
        Вох mybox2 = new Вох();
        double vol;
        // инициализировать каждый экземпляр класса Box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System. out. println ("Объем равен " + vol);
        //получить объем второго параллелепипеда
        vol = mybox2. volume ();
        System.out.println("Объем равен " + vol);
    }
}
