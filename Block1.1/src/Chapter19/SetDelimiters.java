package Chapter19;
import java.util.*;
import java.io.*;
public class SetDelimiters {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;
        FileWriter fout = new FileWriter("test.txt");
        fout.write("2, 3.4, 5,6, 7.4, 9.1, 10.5, готово");
        fout.close();
        FileReader fin = new FileReader ("Test. txt");
        Scanner src = new Scanner(fin);
        src. useDelimiter(", *");

        while ( src. hasNext ())
        {
            if(src.hasNextDouble ())
            { sum += src .nextDouble ();
            count++;
            }else {
                String str = src. next ();
                if(str.equals( "гoтoвo")) break;
                else {
                    System.out.println("Oшибкa формата файла.");
                    return;
                }
            }
        }
        src. close();
        System.out. println( "Cpeднee равно " + sum / count);
    }
}
