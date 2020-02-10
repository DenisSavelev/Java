package Chapter18;
import java.util.*;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put( "��������", "����������" );
        capitals.put ( "�������" , "����������-����");
        capitals.put ( "���������", "�������");
        capitals.put ("����������", "����������");
        capitals.put ( "�������", "������������") ;

        Set<?> states = capitals.keySet();

        for (Object name: states)
        {
            System.out.println("������� ����� " + name + " - " + capitals.getProperty((String)name) + " ");
        }
        System.out.println();
        String str = capitals.getProperty("�������" , " �� �������");
        System.out.println("������� ����� �������" + str + ".");
    }
}
