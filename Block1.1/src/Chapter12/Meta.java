package Chapter12;
import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}
public class Meta {
    @MyAnno(str = "Пример аннотации", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException e)
        {
            System.out.println("Метод не найден. ");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}
