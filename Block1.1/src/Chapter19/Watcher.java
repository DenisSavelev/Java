package Chapter19;
import java.util.*;

public class Watcher implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Метод update() вызван, отсчет count равен " + ((Integer)arg).intValue());

    }
}

class BeingWather extends Observable
{
    void counter(int period) throws InterruptedException {
        for( ; period >=0; period--)
        { setChanged();
        notifyObservers(new Integer(period) );
        try {
            Thread.sleep(100);
        }catch(InterruptedException e)
        {System.out .println("Oжидaниe прервано");}
    }
    }
}

class ObserverDemo {
    public static void main(String args[]) throws InterruptedException {
        BeingWather observed = new BeingWather();
       Watcher observing = new Watcher();
observed. addObserver(observing) ;
observed.counter(10);
    }
}