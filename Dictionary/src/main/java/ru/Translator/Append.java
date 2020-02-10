package ru.Translator;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Append extends Meth implements Insert {
    @Override
    public void Add(List<String> Key, List<String> Value) {
        slovar.put(Key, Value);
    }

    @Override
    public boolean ValidKey(String key) {
        if (key.length() == 4 && key.matches("^[a-z A-Z 0-9]+$"))
            return true;
        else
            System.out.println("Невозможно добавить слово(ошибка ключа)");
        return false;
    }

    @Override
    public boolean ValidValue(String value) {
        if (value.length() == 5 && value.matches("[1-9]+"))
            return true;
        else
            System.out.println("Не возможно добавить второе слово");
        return false;
    }

    @Override
    public boolean Skinwalker() {
        for (Map.Entry<List<String>, List<String>> pair : slovar.entrySet()) {
            if (pair.getValue().get(0).matches("[-+]?\\D+"))
                return true;
            else
                return false;
        }
        return false;
    }
}