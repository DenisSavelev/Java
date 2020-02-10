package Chapter12;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno6{
    String str() default "Тестирование";
    int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos{
    MyAnno6[] value();
}
public class RepeatAnno {
    @MyAnno6(str = "Первая аннотация", val = -1)
    @MyAnno6(str = "Вторая аннотация", val = 100)
    public static void myMeth7(String str, int i){
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth7", String.class, int.class);
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        }catch (NoSuchMethodException e)
        {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth7("test", 10);
    }
}
