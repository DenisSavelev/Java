package Chapter19;
import java.util.*;

public class RandDemo {
    public static void main(String[] args) {
        Random r = new Random();
        double val;
        double sum = 0;
        int bell[] = new int[10];

        for(int i = 0; i<100; i++)
        {
            val = r.nextGaussian();
            sum += val;
            double t = -2;

            for(int x =0; x<10; x++,t+=0.5)
                if (val <t)
                {
                    bell[x]++;
                    break;
                }
        }
        System.out.println("Среднее все значений: " + (sum/100));

        for(int i = 0; i<10; i++)
        {
            for(int x=bell[i]; x>0; x--)
                System.out.print("*");
            System.out.println();
        }
    }

}
