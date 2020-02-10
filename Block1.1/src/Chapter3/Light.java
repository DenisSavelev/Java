package Chapter3;

public class Light {
    public static void main(String args[]) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60; // преобразовать в секунды
        distance = lightspeed * seconds; // вычислить рассто€ние
        System.out.print("«a " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}