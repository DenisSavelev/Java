package ru.Translator;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ViewDictionary extends Meth implements View {
    @Override
    public void Get() {
        for(Map.Entry<List<String>, List<String>> pair : slovar.entrySet())
            System.out.println(pair.getKey() + " " + pair.getValue());
    }
}