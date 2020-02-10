package Chapter9.Default_method;

public interface MyIF {
    int getNumber();
    default String getString() {
        return "Обект типа String по умолчани.";
    }
}
