package Chapter12;

enum Apple3 { Jonathan, GoldenDel, RedDel, Winesap, Cortland}

class EnumDemo4
{public static void main(String args[]) {
    Apple ap, ap2, ap� ;
    System.out.println("Bce ��������� ������ ����� " + "� �� ���������� ��������: ");
    for(Apple a : Apple.values ())
    {System.out.println(a + " " + a.ordinal ());}
    ap = Apple.RedDel; ap2 = Apple.GoldenDel; ap� = Apple.RedDel;
    System.out .println();
    if(ap.compareTo(ap2) < 0) System.out.println(ap + " ������������ " + ap2);
    if(ap.compareTo(ap2) > 0) System.out.println(ap2 + " ������������ " + ap) ;
    if(ap.compareTo(ap�) == 0) System.out. println(ap +"����� "+ ap�);
    {System.out.println();}
    if(ap.equals(ap2)){ System.out. println ("O����a!");}
    if(ap.equals(ap�)) {System.out. println(ap + " ����� "+ ap�);}
    if(ap == ap�){ System.out.println(ap + "==" + ap�);}
}
}