package Chapter18;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("����");
        hs.add("�����");
        hs.add("���");
        hs.add("�����");
        hs.add("�������");
        hs.add("�����");
        System.out.println(hs);
    }
}
