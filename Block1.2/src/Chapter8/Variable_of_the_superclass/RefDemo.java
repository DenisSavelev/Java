package Chapter8.Variable_of_the_superclass;

class Box {
    double width;
    double height;
    double depth;

    //сконструировать клон объекта
    Box (Box ob ) {     // передать объе кт конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, применяемый при указании всех размеров
    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор , применяемый при указании всех размеров
    Box () {
        width = -1;
        height = -1;
        depth = -1;
    }

    //конструктор , применяемый при  создании  куба
    Box(double len) {
        width = height = depth = len;
    }
    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

//расширить класс Вох, включив в него поле веса
class BoxWeight extends Box {
    double weight; // вес параллелепипеда

    //конструктор BoxWeight()
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class  ColorBox extends Box {
    int color;

    ColorBox(double w, double h, double d, int c){
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объём weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        plainbox = weightbox;
        vol = plainbox.volume();

        System.out.println("Объём plainbox равен " + vol);
    }
}
