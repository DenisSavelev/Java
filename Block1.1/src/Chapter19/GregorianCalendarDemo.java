package Chapter19;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
    public static void main(String[] args) {
        String months[] = {"Jan", "Feb", "Mar", "Apr", "���", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int year = 2020;
        GregorianCalendar gcalendar = new GregorianCalendar();
        System.out.print("����: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(gcalendar.get(Calendar.YEAR));
        System.out.print("�����: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        if(gcalendar.isLeapYear(year))
        {
            System.out.println("������� ��� ����������");
        }else {System.out.println("������� ��� �� ����������");}

    }
}
