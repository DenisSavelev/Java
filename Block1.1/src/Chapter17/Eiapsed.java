package Chapter17;

public class Eiapsed {
    public static void main(String[] args) {
        long start, end = 0;
        System.out.println("Измерение времение перебора от 0 до 100000000");
        start = System.currentTimeMillis();
        for(long i = 0; i<100000000L;i++ )
        end = System.currentTimeMillis();

        System.out.println("Время выполнения: " + (end-start));
    }
}
