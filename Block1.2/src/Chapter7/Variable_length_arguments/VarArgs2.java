package Chapter7.Variable_length_arguments;

public class VarArgs2 {
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args){
        vaTest("Один параметр переменной длины : ", 10);
        vaTest("Tpи параме тра переменной длины: ",1, 2, 3);
        vaTest("Бeз параметров переменной длины: ");
    }
}
