package Chapter19;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");

        if(noVal.isPresent()) System.out.println("Объект hasVal содержит следующую строку: " + hasVal.get());

        String defStr = noVal.orElse("Строка по умолчанию");
        System.out.println(defStr);
    }
}
