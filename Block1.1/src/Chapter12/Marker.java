package Chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{
}

public class Marker {
    @MyMarker
    public static void myMeth5()
    {
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth5");
            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("Аннотация-маркер MyMarker присутствует.");
        }catch (NoSuchMethodException e)
        {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth5();
    }
}
