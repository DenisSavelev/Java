package Chapter18;

import java.util.*;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(-8);
        list.add(20);
        list.add(-20);
        list.add(8);
        //���������� � �������� ����������������
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(list, r);

        System.out.print("������ ������������ � �������� �������: ");

        for(int i: list)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    Collections.shuffle(list);
    System.out.print("������ �����������: ");
    for(int i: list)
    {
        System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("�������: " + Collections.min(list));
    System.out.println("��������: " + Collections.max(list));


    }
}
