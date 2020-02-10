package ru.Translator;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Invert extends Meth implements Revolution {
    @Override
    public void FlipOver() {
        Map<List<String>, List<String>> dictonary = new HashMap<>();
        for (Map.Entry<List<String>, List<String>> pair : slovar.entrySet()) {
            List<String> key = new ArrayList<>();
            List<String> value = new ArrayList<>();
            for (int i = 0; i < pair.getValue().size(); i++)
                value.add(pair.getValue().get(i));
            Collections.sort(value);

            for (Map.Entry<List<String>, List<String>> pair1 : slovar.entrySet()) {
                List<String> temp = new ArrayList<>();
                for (int i = 0; i < pair1.getValue().size(); i++)
                    temp.add(pair1.getValue().get(i));
                Collections.sort(temp);
                if (value.equals(temp))
                    for (int i = 0; i < pair1.getKey().size(); i++)
                        key.add(pair1.getKey().get(i));
            }
            dictonary.put(value, key);
        }
        slovar.clear();
        for (Map.Entry<List<String>, List<String>> pair : dictonary.entrySet())
            slovar.put(pair.getKey(), pair.getValue());
        dictonary.clear();
    }
}