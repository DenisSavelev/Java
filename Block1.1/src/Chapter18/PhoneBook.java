package Chapter18;

import java.util.*;
import java.io.*;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        try {
            fin = new FileInputStream("phonebook.dat");
        }catch (FileNotFoundException r)
        {}

        try {
            if(fin!=null){
                ht.load(fin);
            fin.close();}
        }catch (IOException r)
        {
            System.out.println("Ошибка чтения файла.");
        }

        do {
            System.out.println("Введите имя" + "('выход' для заврешения): " );
            name = br.readLine();
            if(name.equals("выход")) continue;
            System.out.println("Введите номер: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        }while (!name.equals("выход"));

        if(changed)
        {FileOutputStream fout = new FileOutputStream("phonebook.dat");
        ht.store(fout, "Телефонная книга");
        fout.close();}

        do {
            System.out.println("Введите имя для поиска" + "('выход' для заврешения): ");
            name = br.readLine();
            if(name.equals("вызод")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        }while (!name.equals("выход"));
    }
}
