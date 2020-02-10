import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class Meth {
    protected static String fileName = null;
    private static Map<String, String> slovar = new HashMap<String, String>();

    public Meth(String FileName) throws IOException {
        fileName = FileName;
        Reader();
    }

    protected static void Reader() throws IOException           //чтение пар слов и запись в map
    {
        FileInputStream fileReader = new FileInputStream(fileName);
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(fileReader));
        while (bufferedReader1.ready()) {
            String[] str = bufferedReader1.readLine().split("-");
            slovar.put(str[0], str[1]);
        }
    }

    public static void Delete(String DelKey)
    {
        System.out.println("Запись удалена успешно");
        slovar.remove(DelKey);
    }

    public static void Search(String SerKey) {
        System.out.println(slovar.get(SerKey));
    }

    public static void Add(String AddKey, String AddWord) throws FileNotFoundException {
        if(AddKey.length()==4 && AddKey.matches("^[a-zA-Z0-9]+$"))
        {
            if(AddWord.length()==5 && AddWord.matches("[1-9]+")) {
                slovar.put(AddKey, AddWord);
                System.out.println("Упешно добавлено");
            }
            else
                System.out.println("Невозможно добавить слово(ошибка второго слова)");
        }
        else
            System.out.println("Невозможно добавить слово(ошибка ключа)");
    }

    public static void Get() {
        for(Map.Entry<String, String> pair : slovar.entrySet()) {
            String key = pair.getKey();
            String word = pair.getValue();
            System.out.println(key + " " + word);
        }
    }

    public static void saveMap() throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (Map.Entry<String, String> pair : slovar.entrySet()) {
            String key = pair.getKey();
            String word = pair.getValue();
            fileWriter.write(key+"-" + word+ "\n");
        }
        fileWriter.close();
    }

    public static void main(String[] args) {

    }
}