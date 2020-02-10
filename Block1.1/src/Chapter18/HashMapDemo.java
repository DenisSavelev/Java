package Chapter18;

import java.util.*;


public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<String, Double>();
        hm.put( "Джон Доу", new Double(3434.34));
        hm.put ( "Toм Смит", new Double(123.22));
        hm.put("Джейн Бейкер", new Double( 1378.00));
        hm.put ( "Toд Холл", new Double(99.22));
        hm.put ("Paльф Смит", new Double(-19.08));

        Set<Map.Entry<String, Double>> set =  hm.entrySet();
        for(Map.Entry<String, Double> me : set)
        {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance =hm.get("Джон Доу");
        hm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остатов на счете Джона Доу: " + hm.get("Джон Доу"));

    }
}
