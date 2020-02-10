package Chapter19;
import java.util.*;
public class AvqNums {
    public static void main(String[] args) {
        Scanner conin = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        System.out.println("Bвeдитe числа для подсчета среднего.");
        while(conin. hasNext())
        {
            if(conin.hasNextDouble()){
                sum += conin.nextDouble();
                count++;
            }else
            {
                String str = conin. next ();
                if(str. equals("гoтoвo")) break;
                else {
                    System.out.println( "Oшибкa формата данных.");
                    return;
                }
            }
        }
        conin.close();
        System.out.println( "Cpeднee равно "+ sum / count);
    }
}
