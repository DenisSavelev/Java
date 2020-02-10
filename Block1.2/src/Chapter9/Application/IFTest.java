package Chapter9.Application;

class FixedStack implements IntStack {
    private int stck[];
    private int tos;
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stck.length)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos < 0)
        {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        for(int i = 0; i < 5; i++)
            mystack1.push(i);
        for (int i = 0; i < 8; i++)
            mystack2.push(i);

        System.out.print("Стек в mystack1: ");
        for(int i = 0; i < 5; i++)
            System.out.print(mystack1.pop() + " ");
        System.out.print("\nСтек в mystack2: ");
        for(int i = 0; i < 8; i++)
            System.out.print(mystack2.pop() + " ");
    }
}
