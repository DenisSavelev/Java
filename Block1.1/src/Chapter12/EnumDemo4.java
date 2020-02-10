package Chapter12;

enum Apple3 { Jonathan, GoldenDel, RedDel, Winesap, Cortland}

class EnumDemo4
{public static void main(String args[]) {
    Apple ap, ap2, apЗ ;
    System.out.println("Bce константы сортов яблок " + "и их порядковые значения: ");
    for(Apple a : Apple.values ())
    {System.out.println(a + " " + a.ordinal ());}
    ap = Apple.RedDel; ap2 = Apple.GoldenDel; apЗ = Apple.RedDel;
    System.out .println();
    if(ap.compareTo(ap2) < 0) System.out.println(ap + " предшествует " + ap2);
    if(ap.compareTo(ap2) > 0) System.out.println(ap2 + " предшествует " + ap) ;
    if(ap.compareTo(apЗ) == 0) System.out. println(ap +"равно "+ apЗ);
    {System.out.println();}
    if(ap.equals(ap2)){ System.out. println ("Oшибкa!");}
    if(ap.equals(apЗ)) {System.out. println(ap + " равно "+ apЗ);}
    if(ap == apЗ){ System.out.println(ap + "==" + apЗ);}
}
}