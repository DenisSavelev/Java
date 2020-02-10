package ru.Translator;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class FindInDictonary extends Meth implements Find {
    @Override
    public void Search(String SerKey) {
        boolean flag = false;
        for (Map.Entry<List<String>, List<String>> pair : slovar.entrySet()) {
            for (int i = 0; i < pair.getKey().size(); i++)
                if (pair.getKey().get(i).equals(SerKey)) {
                    flag = true;
                    break;
                }
            if (flag) {
                System.out.println(pair.getKey() + " " + pair.getValue());
                break;
            }
        }
        if (!flag)
            System.out.println("К сожалению ваше слово не найдено :(");
    }
}