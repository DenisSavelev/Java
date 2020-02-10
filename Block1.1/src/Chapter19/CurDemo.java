package Chapter19;
import java.util.*;
public class CurDemo {
    public static void main(String[] args) {
        Currency c;

        c = Currency.getInstance(Locale.US);

        System.out.println("Символ: " + c.getSymbol());
        System.out.println("Количество цифр в дробной части числа по умолчанию: " + c.getDefaultFractionDigits());
    }
}
