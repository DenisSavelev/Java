package Chapter12;

enum Apple2 { Jonathan(10), GoldenDel (9), RedDel (12), Winesap (15), Cortland (8);
    private int price; // ���� ������ ������� �����
 Apple2(int �)
{ price = �; }
int getPrice()
{ return price; }}
class EnumDemo�{
    public static void main(String args[])
{Apple2 ap;
         System.out.println( "���o�o ����� Winesap ����� " + Apple2.Winesap.getPrice () + " ������. \n");
        System.out. println( "�e�� �� ��� ����� �����:");
        for(Apple2 a : Apple2.values ())
    {System.out.println(a + " ����� " + a.getPrice () + " ������."); }
}
}
