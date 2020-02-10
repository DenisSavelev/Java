package Chapter17;

public class NewThread extends Thread {
    boolean suspendFlag;

    NewThread(String threadname, ThreadGroup tgOb) {
        super(tgOb, threadname);
        System.out.println("Новый поток: " + this);
        suspendFlag = false;
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Исключение в " + getName());
        }
        System.out.println(getName() + " завершается");
    }

    synchronized void mysuspend()
    {suspendFlag = true;}
    synchronized void myresime()
    {suspendFlag = false;
    notify();}
}


class ThreadGroupDemo
{
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup ("Гpyплa А");
        ThreadGroup groupB = new ThreadGroup ("Гpyллa В");


        NewThread ob1 = new NewThread("Oдин", groupA) ;
        NewThread ob2 =new NewThread ("Двa", groupA) ;
        NewThread ob3 = new NewThread("Tpи", groupB);
        NewThread ob4 = new NewThread("Четыре", groupB);

        System.out.println("\nВывод из метода list():");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Прерывается Группа А");
        Thread tga[] = new Thread[(groupA.activeCount())];
        groupA.enumerate(tga);

        for (int i = 0; i<tga.length; i++)
        {
            ((NewThread)tga[i]).mysuspend();
        }
        try {
            Thread.sleep(4000);
        }catch (InterruptedException t)
        {
            System.out.println("Главный поток исполнения прерван.");
        }

        System.out.println("Возобновление группы А");
        for(int i = 0; i<tga.length; i++)
        {
            ((NewThread)tga[i]).myresime();
        }

        try {
            System.out.println("Ожидание завршения потоков исполнения");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception r){
            System.out.println("Исключение в главном потоке исполнения");
        }
        System.out.println("Главный поток исполнения завершен.");
    }
}