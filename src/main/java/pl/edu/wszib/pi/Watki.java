package pl.edu.wszib.pi;

import java.util.Random;

import static java.lang.Math.sqrt;

public class Watki implements Runnable {

    @Override
    public void run() {
        int shots, hits = 0;
        shots = 100000;
        double x[] = new double[ shots];
        double y[] = new double[shots];
        double r=0;

        for(int i = 0; i<shots; i++){
           x[i] = 2 * (new Random().nextDouble()) - 1;
           y[i] = 2 * (new Random().nextDouble()) - 1;

           r = sqrt(x[i]*x[i] + y[i]*y[i]);

           if(r<=1){
               hits++;
           }
        }
        App.shots += shots;
        App.hits += hits;
    }
}
