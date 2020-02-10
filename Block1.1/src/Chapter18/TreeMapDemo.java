package Chapter18;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>();
        tm.put ( "���� ���", new Double(3434.34) );
        tm. put ( "To� ����", new Double(123.22));
        tm.put("����� ������", new Double(1378.00));
        tm.put( "To� ����", new Double(99.22));
        tm.put ("Pa��� ����", new Double(-19.08));

        Set<Map.Entry<String,Double>> set = tm.entrySet();

        for(Map.Entry<String, Double> me : set)
        {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("���� ���");
        tm.put("���� ���" , balance + 1000);
        System.out.println("����� ������� �� ����� ����� ���: " + tm.get("���� ���"));
    }
}
