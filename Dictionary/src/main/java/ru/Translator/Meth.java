package ru.Translator;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;
import java.util.*;

public class Meth {
    @Value("${meth.fileName}")
    private String fileName;
    protected static Map<List<String>, List<String>> slovar = new HashMap<>();

    @PostConstruct
    private void Reader() throws IOException {
        FileInputStream fileReader = new FileInputStream(fileName);
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(fileReader));
        while (bufferedReader1.ready()) {
            String[] str = bufferedReader1.readLine().split("-");
            List<String> key = newList(str[0]);
            List<String> value = newList(str[1]);
            slovar.put(key, value);
        }
        fileReader.close();
    }

    private List<String> newList(String S) {
        List<String> temp = new ArrayList<>();
        String[] stroka = S.split(", ");
        for (String s: stroka)
            temp.add(s);
        return temp;
    }

    @PreDestroy
    private void saveMap() throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (Map.Entry<List<String>, List<String>> pair : slovar.entrySet()) {
            List<String> key = new ArrayList<>(pair.getKey());
            List<String> value = new ArrayList<>(pair.getValue());
            String out = key.get(0);
            if (key.size() > 1)
                for (int i = 1; i < key.size(); i++)
                    out += ", " + key.get(i);
            out += "-" + value.get(0);
            if (value.size() > 1)
                for (int i = 1; i < value.size(); i++)
                    out += ", " + value.get(i);
            fileWriter.write(out + "\n");
        }
        fileWriter.close();
    }
}