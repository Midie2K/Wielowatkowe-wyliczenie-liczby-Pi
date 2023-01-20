package pl.edu.wszib.pi;

public class App {
    public static long shots = 0, hits = 0;
    public static void main(String[] args) {
        double pi;
        Thread t0 = new Thread(new Watki());
        Thread t1 = new Thread(new Watki());
        Thread t2 = new Thread(new Watki());
        Thread t3 = new Thread(new Watki());
        Thread t4 = new Thread(new Watki());
        Thread t5 = new Thread(new Watki());
        Thread t6 = new Thread(new Watki());
        Thread t7 = new Thread(new Watki());
        Thread t8 = new Thread(new Watki());
        Thread t9 = new Thread(new Watki());

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();

        try{
            t0.join();
            t1.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
        } catch (InterruptedException e){}



        pi =(double) (4 * hits)/shots;

        System.out.println(
                new StringBuilder()
                        .append("Ilosc strzalow : ")
                        .append(shots)
                        .append("\nIlosc trafien : ")
                        .append(hits)
                        .append("\nWyliczone Pi : ")
                        .append(pi)
                );
    }


}
