package Chapter17;

import java.io.*;

public class ParseDemo {
    public static void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str;
            int i, sum = 0;
            System.out.println("������� �����, 0 - ��� ������.");
            do {
                str = reader.readLine();
                try {
                    i = Integer.parseInt(str);
                }catch (NumberFormatException r) {
                System.out.println("�������� ������");
                i = 0;
                }
                sum +=i;
                System.out.println("������� �����: " + sum);

            }while (i!=0);
        }

}
