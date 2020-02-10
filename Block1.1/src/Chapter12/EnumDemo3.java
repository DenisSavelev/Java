package Chapter12;

enum Apple2 { Jonathan(10), GoldenDel (9), RedDel (12), Winesap (15), Cortland (8);
    private int price; // цена яблока каждого сорта
 Apple2(int р)
{ price = р; }
int getPrice()
{ return price; }}
class EnumDemoЗ{
    public static void main(String args[])
{Apple2 ap;
         System.out.println( "Яблoкo сорта Winesap стоит " + Apple2.Winesap.getPrice () + " центов. \n");
        System.out. println( "Цeны на все сорта яблок:");
        for(Apple2 a : Apple2.values ())
    {System.out.println(a + " стоит " + a.getPrice () + " центов."); }
}
}
