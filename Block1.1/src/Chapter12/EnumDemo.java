package Chapter12;

enum Apple { Jonathan, GoldenDel, RedDel, Winesap, Cortland}

    class EnumDemo { public static void main(String args[]) {
        Apple ap; ap = Apple.RedDel;
        System.out.println("��a�e��e ��: " + ap) ;
        System.out.println(); ap = Apple.GoldenDel;
        if(ap == Apple. GoldenDel)
            System.out .println( "�epe�e��a� �� �������� GoldenDel.\n") ;
        switch (ap) { case Jonathan: System.out.println( "Cop� Jonathan �������.");
        break; case GoldenDel: System.out. println( "Cop� Golden Delicious ������."); break; case RedDel: System.out. println( "Cop� Red Delicious �������.");
        break; case Winesap : System.out.println( "Cop� Winesap �������."); break; case Cortland: System.out. println( "Cop� Cortland �������.");
        break;
        }
    }
}
