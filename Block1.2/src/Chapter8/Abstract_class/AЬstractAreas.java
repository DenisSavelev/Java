package Chapter8.Abstract_class;

abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class  Rectangle extends Figure {
    Rectangle (double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("В области четыругольника.");
        return dim1 * dim2;
    }
}

class Tringle extends Figure {
    Tringle (double a, double b){
        super(a, b);
    }

    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}

public class AЬstractAreas {
    public static void main(String[] agrs){
        Rectangle r = new Rectangle(9, 5);
        Tringle t = new Tringle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}
