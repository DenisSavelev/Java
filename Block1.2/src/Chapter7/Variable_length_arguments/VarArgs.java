package Chapter7.Variable_length_arguments;

public class VarArgs {
    static void vaTest(int ... v) {
        System.out.print("Koличecтвo аргументов: " + v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args){
        // Обратите внимание на возможные способы вызова
        // метода vaTest() с аргументами переменной длины
        vaTest(10); // 1 аргумент
        vaTest(1, 2, 3); // 3 аргумента
        vaTest(); // без аргументов
    }
}
