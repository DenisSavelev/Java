package Chapter19;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");

        if(noVal.isPresent()) System.out.println("������ hasVal �������� ��������� ������: " + hasVal.get());

        String defStr = noVal.orElse("������ �� ���������");
        System.out.println(defStr);
    }
}
