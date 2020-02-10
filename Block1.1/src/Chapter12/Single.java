package Chapter12;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
    int value();
}
public class Single {
    @MySingle(100)
    public static void myMeth6() {
        Single ob = new Single();
        try {
            Method m = ob.getClass().getMethod("myMeth6");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String args[])
    {
        myMeth6();
    }
}
