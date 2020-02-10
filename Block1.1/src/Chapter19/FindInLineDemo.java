package Chapter19;
import java .util.*;
public class FindInLineDemo {
    public static void main(String[] args) {
        String instr = "Имя: Том Возраст: 28 ID: 77";
        Scanner conin = new Scanner (instr);

        conin.findInLine("Возраст:") ;
        if(conin.hasNext())
        {
            System.out.println(conin. next ());
        }else  System.out. println( "Omибкa!");
        conin.close();
    }
}
