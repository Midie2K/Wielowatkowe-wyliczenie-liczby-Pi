package pl.edu.wszib.pi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static long shots = 0, hits = 0;

    public static void main(String[] args) {
        double pi;
        int numberOfThreads = 10;

        ExecutorService Pi = Executors.newFixedThreadPool(numberOfThreads);

        for(int i = 0; i<numberOfThreads; i++){
            Pi.execute(new Watki());
        }
        Pi.shutdown();

        while(!Pi.isTerminated()){} // "Czekanie" na watki skoncza swoje zadania

        pi = (double) (4 * hits)/shots;
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

