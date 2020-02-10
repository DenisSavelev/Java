package Chapter12;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3{
    String str() default "Тестирование";
    int val() default 9000;
}

public class Meta3 {
    @MyAnno3()
    public static void myMeth3(){
        Meta3 ob3 = new Meta3();

        try {
            Class<?> c3 = ob3.getClass();
            Method m3 = c3.getMethod("MyMethod");
            MyAnno3 anno3 = m3.getAnnotation(MyAnno3.class);
            System.out.println(anno3.str() + " " + anno3.val());
        }catch (NoSuchMethodException exc)
        {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth3();
    }
}
