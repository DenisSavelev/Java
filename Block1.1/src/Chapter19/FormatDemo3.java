package Chapter19;
import java.util.*;
public class FormatDemo3 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt .format ( "����������� �����%n�������� ��������� �� %d%%", 88);
        System.out. println(fmt);
        fmt .close();
    }
}
