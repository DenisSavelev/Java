package ru.Translator;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Clean extends Meth implements Remove {
    @Override
    public void Delete(String DelKey) {
        boolean flag = false;
        for (Map.Entry<List<String>, List<String>> pair : slovar.entrySet()) {
            for (String S : pair.getKey())
                if (S.equals(DelKey)) {
                    slovar.remove(pair.getKey());
                    flag = true;
                    break;
                }
            if(flag) {
                System.out.println("Строчка успешно удалена!");
                break;
            }
        }
    }
}