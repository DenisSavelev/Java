package Chapter12;
import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2{
    String str();
    int val();
}
public class Meta2 {
    @MyAnno(str = "Два примера", val = 19)
    public static void myMeth2(String str, int i) {
        Meta ob1 = new Meta();

        try {
            Class<?> c1 = ob1.getClass();
            Method m1 = c1.getMethod("myMeth", String.class, int.class);

            MyAnno2 anno2 = m1.getAnnotation(MyAnno2.class);

            System.out.println(anno2.str() + " " + anno2.val());
        }catch (NoSuchMethodException exc)
        {
            System.out.println("Метод не найден. ");
        }

    }

    public static void main(String[] args) {
        myMeth2("Test", 10);
    }
}
