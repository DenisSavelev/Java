package Chapter14.Generalized_method;

public class GenMetgDemo {
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for(int i = 0; i < y.length; i++)
            if(x.equals(y[i]))
                return true;
            return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};

        if(isIn(2, nums))
            System.out.println("Число 2 содержится в массиве nums");
        if(!isIn(7, nums))
            System.out.println("Число 7 отсутсвует в массиве nums");
        System.out.println();
        String strs[] = {"один", "два", "три", "четыре", "пять"};
        if(isIn("два", strs))
            System.out.println("Два содержится в массиве strs");
        if(!isIn("семь", strs))
            System.out.println("Семь отсутствует в массиве strs");
    }
}
