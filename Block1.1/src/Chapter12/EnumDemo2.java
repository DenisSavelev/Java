package Chapter12;

enum Apple1 { Jonathan, GoldenDel, RedDel, Winesap, Cortland}

class EnumDemo2 { public static void main(String args[]) {
    Apple1 ap; ap = Apple1.RedDel;
    Apple1 allapples[] = Apple1.values();
    for(Apple1 a : allapples)
    System.out.println(a);
     System.out.println();
ap = Apple1.valueOf("Winesap");
System.out. println( "Пepeмeннaя ар содержит "+ ap) ;
        }
}
