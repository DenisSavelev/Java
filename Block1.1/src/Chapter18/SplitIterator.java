package Chapter18;
import java.util.*;

class SplitIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.println("Содержимое списочного массива vals:\n");
        Spliterator<Double> splitIterator = vals.spliterator();

        while (splitIterator.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        splitIterator = vals.spliterator();
        ArrayList<Double>  sqrs = new ArrayList<>();
        while (splitIterator.tryAdvance((n) ->sqrs.add(Math.sqrt(n))));

        System.out.println("Содержимое списочного массива sqrs:\n");
        splitIterator = sqrs.spliterator();
        splitIterator .forEachRemaining((n)->System.out.println(n));
        System.out.println();
    }
}
