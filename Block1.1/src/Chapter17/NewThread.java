package Chapter17;

public class NewThread extends Thread {
    boolean suspendFlag;

    NewThread(String threadname, ThreadGroup tgOb) {
        super(tgOb, threadname);
        System.out.println("����� �����: " + this);
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
            System.out.println("���������� � " + getName());
        }
        System.out.println(getName() + " �����������");
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
        ThreadGroup groupA = new ThreadGroup ("�py��a �");
        ThreadGroup groupB = new ThreadGroup ("�py��a �");


        NewThread ob1 = new NewThread("O���", groupA) ;
        NewThread ob2 =new NewThread ("��a", groupA) ;
        NewThread ob3 = new NewThread("Tp�", groupB);
        NewThread ob4 = new NewThread("������", groupB);

        System.out.println("\n����� �� ������ list():");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("����������� ������ �");
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
            System.out.println("������� ����� ���������� �������.");
        }

        System.out.println("������������� ������ �");
        for(int i = 0; i<tga.length; i++)
        {
            ((NewThread)tga[i]).myresime();
        }

        try {
            System.out.println("�������� ��������� ������� ����������");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception r){
            System.out.println("���������� � ������� ������ ����������");
        }
        System.out.println("������� ����� ���������� ��������.");
    }
}