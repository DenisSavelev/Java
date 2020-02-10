package ru.Translator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        String action = null;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Какое действие хотите совершить над словарём?" + "\n" + "(Просмотр\\Найти\\Добавить\\Удалить\\Перевернуть)");
            action = input.readLine();
            if (action.equalsIgnoreCase("Просмотр")  || action.equalsIgnoreCase("Ghjcvjnh")) {
                View view = context.getBean("viewDictionary", ViewDictionary.class);
                view.Get();
            }
            else if (action.equalsIgnoreCase("Найти") || action.equalsIgnoreCase("Yfqnb")) {
                System.out.print("Введите слово, которое хотите найти: ");
                Find find = context.getBean("findInDictonary", FindInDictonary.class);
                find.Search(input.readLine());
            }
            else if (action.equalsIgnoreCase("Добавить") || action.equalsIgnoreCase("Lj,fdbnm")) {
                Insert insert = context.getBean("append", Append.class);
                List<String> key = new ArrayList<>();
                List<String> value = new ArrayList<>();
                int k;
                if (!insert.Skinwalker()) {
                    System.out.print("Сколько слов в ключе? ");
                    k = Integer.parseInt(input.readLine());
                    for (int i = 0; i < k; i++)
                        if (insert.ValidKey(action = input.readLine()))
                            key.add(action);
                    System.out.print("Сколько слов в значении? ");
                    k = Integer.parseInt(input.readLine());
                    for (int i = 0; i < k; i++)
                        if (insert.ValidValue(action = input.readLine()))
                            value.add(action);
                    insert.Add(key, value);
                }
                else {
                    System.out.print("Сколько слов в ключе? ");
                    k = Integer.parseInt(input.readLine());
                    for (int i = 0; i < k; i++)
                        if (insert.ValidValue(action = input.readLine()))
                            key.add(action);
                    System.out.print("Сколько слов в значении? ");
                    k = Integer.parseInt(input.readLine());
                    for (int i = 0; i < k; i++)
                        if (insert.ValidKey(action = input.readLine()))
                            value.add(action);
                    insert.Add(key, value);
                }
            }
            else if (action.equalsIgnoreCase("Удалить") || action.equalsIgnoreCase("Elfkbnm")) {
                System.out.print("Какую строчку вы хотели бы удалить(введите одно из значений ключа)? ");
                Remove remove = context.getBean("clean", Clean.class);
                remove.Delete(input.readLine());
            }
            else if (action.equalsIgnoreCase("Перевернуть") || action.equalsIgnoreCase("Gthtdthyenm")) {
                Revolution revolution = context.getBean("invert", Invert.class);
                revolution.FlipOver();
            }
            System.out.println("Хотели бы вы закончить работу(Exit)?");
            action = input.readLine();
        } while (!(action.equalsIgnoreCase("Exit") || action.equalsIgnoreCase("Учше")));
        context.close();
    }
}