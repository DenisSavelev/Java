import java.io.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        boolean stopFlag = true;
        String FileName = "D:\\Bibl\\Slovar.txt";
        Meth file = new Meth(FileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Что хотите сделать со словарем(найти/добавить/удалить/просмотр)?");
            String searchword = bufferedReader.readLine();
            if(searchword.equals("найти"))
            {
                System.out.println("Введите ключ поиска");
                String g = bufferedReader.readLine();
                Meth.Search(g);
            }
            else if(searchword.equals("добавить")) {
                System.out.println("Введите ключ(4 латинских символа)-значение(5 цифр)");
                String key = bufferedReader.readLine();
                String word = bufferedReader.readLine();
                Meth.Add(key, word);
            }
            else if(searchword.equals("удалить"))
            {
                System.out.println("Введите ключ для удаления пары слов");
                String key = bufferedReader.readLine();
                Meth.Delete(key);
            }
            else if(searchword.equals("просмотр")) {
                Meth.Get();
            }
            System.out.println("Повторить?");
            String readLine = bufferedReader.readLine();
            if(readLine.equals("Нет")) {
                stopFlag = false;
            }
        } while(stopFlag);
        Meth.saveMap();
    }
}