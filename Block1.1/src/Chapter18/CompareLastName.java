package Chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CompareLastName implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        int i,j;
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

class CompareThenByFirstName implements Comparator<String>
{
    @Override
    public int compare(String aStr, String bStr) {
        int i,j;
        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo2A
{
    public static void main(String[] args) {
        CompareLastName compareLastName = new CompareLastName();
        Comparator<String> compLastThenFirst = compareLastName.thenComparing(new CompareThenByFirstName());
        TreeMap<String, Double> tm = new TreeMap<String, Double>(compLastThenFirst);

        tm.put( "Джон Доу", new Double(3434.34));
        tm.put ( "Toм Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double( 1378.00));
        tm.put ( "Toд Холл", new Double(99.22));
        tm.put ("Paльф Смит", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for(Map.Entry<String, Double> me : set )
        {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + tm.get("Джон Доу"));
    }
}