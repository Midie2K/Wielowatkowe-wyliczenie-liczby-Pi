package pl.edu.wszib.pi;

import java.util.Random;

import static java.lang.Math.sqrt;

public class Watki implements Runnable {

    @Override
    public void run() {
        int shots, hits = 0;
        shots = 100000;
        double x;
        double y;
        double r=0;

        for(int i = 0; i<shots; i++){
           x = 2 * (new Random().nextDouble()) - 1;
           y = 2 * (new Random().nextDouble()) - 1;

           r = sqrt(x*x + y*y);

           if(r<=1){
               hits++;
           }
        }
        App.shots += shots;
        App.hits += hits;
    }
}
