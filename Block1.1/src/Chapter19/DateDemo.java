package Chapter19;
import java.util.*;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long msec = date.getTime();
        System.out.println("���������� �����������, ��������� � " +
                "1 ������ 1070 �. �� �������� = " + msec);
    }
}
