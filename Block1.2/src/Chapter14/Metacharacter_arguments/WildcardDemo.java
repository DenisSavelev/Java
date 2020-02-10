package Chapter14.Metacharacter_arguments;

class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for(int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }

    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average())
            return true;
        return false;
    }
}

public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<>(fnums);
        double x = iob.average();
        System.out.println("Среднее значение fob равно " + x);

        System.out.print("Cpeдниe значения iob и dob ");
        if(iob.sameAvg(dob))
            System.out.println("paвны.");
        else
            System.out.println( "oтличaютcя.") ;
        System.out.print( "Cpeдниe iob и fob");
        if(iob.sameAvg(fob))
            System.out.println(" oдинaкoвы.");
        else
            System.out.println(" oтличaютcя.");
    }
}
