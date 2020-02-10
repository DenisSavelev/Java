package Chapter6.Simple_class;

     class Вох {
        double width;
        double height;
        double depth;
    }

    //В этом классе объявляется объект тиnа Вох
    class BoxDemo {
        public static void main(String[] args) {
            Вох mybox = new Вох();
            double vol;
            // присвоить значение переменным экземпляра myЬох
            mybox.width = 10;
            mybox.height = 20;
            mybox.depth = 15;
            // рассчитать объем параллелепипеда
            vol = mybox.width * mybox.height * mybox.depth;
            System.out.println(" Oбъeм равен " + vol);
    }
}
