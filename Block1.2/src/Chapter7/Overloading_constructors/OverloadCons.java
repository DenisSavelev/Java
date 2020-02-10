package Chapter7.Overloading_constructors;

class Box {
    double width;
    double height;
    double depth;
    //конструктор, используемый при указании всех размеров
    Box(double w, double h, double d) {
        System.out.println("Конструирование объекта Вох");
        width = w;
        height = h;
        depth = d;
    }
    //конструктор, используемый, когда ни один из размеров не указан
    Box(){
        System.out.println("Конструирование объекта Вох");
        width = -1;
        height = -1;
        depth = -1;
    }
    // конс труктор , исполь зуемый при со здании куба
    Box ( double len ) {
        width = height = depth = len;
    }
    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args){
        // создать параллелепипеды, используя разные конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;
        // получить объем первого параллелепипеда
        vol = mybox1.volume ();
        System.out.println ("Объем mybox1 равен " + vol);
        // получить объем второго параллелепипеда
        vol = mybox2.volume ();
        System.out.println ("Объем mybox2 равен " + vol);
        // получить объём куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}
