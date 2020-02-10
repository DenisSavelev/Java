package Chapter18;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();

        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("Извлечение из стека: ");

        while (adq.peek() != null) System.out.println(adq.pop() + " ");

        System.out.println();
    }
}
