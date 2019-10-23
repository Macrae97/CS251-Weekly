package week5.assessment;

import java.util.Random;

public class CylinderGenerator {

    public void run(int n){

        long start = System.nanoTime();
        Random random = new Random();

        double radius = 0;
        double height = 0;

        Cylinder[] cylinders = new Cylinder[n];

        for(int i = 0; i < cylinders.length; i++){
            radius = 1.0 + (15.0 - 1.0) * random.nextDouble();
            height = 1.0 + (15.0 - 1.0) * random.nextDouble();
            cylinders[i] = new Cylinder(radius, height);
        }

        for(int i = 0; i < cylinders.length; i++) {
            System.out.print(cylinders[i].toString());
        }

        long end = System.nanoTime();

        System.out.println("\nThe algorithm ran in " + (end - start) + " nanoseconds with " + n + " cylinders.");

    }
}
