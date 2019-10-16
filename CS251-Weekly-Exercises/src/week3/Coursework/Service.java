package week3.Coursework;

import week3.Parser;

public class Service {

    private Parser parser;

    public Service() {
        this.parser = new Parser();
    }

    public void run() {

        int noOfCylinders = 0;
        boolean finished = false;

        while (!finished) {

            System.out.println("How many cylinders do you want to store? (1-100)");

            try {
                //prompt user for input
                noOfCylinders = parser.getInput();
            } catch (NumberFormatException n) {
                System.err.println("Value entered is not valid");
            }

            if (noOfCylinders > 0 && noOfCylinders <= 100) {
                Cylinder[][] cylinders = getCylinderInformation(noOfCylinders);
                printCylinders(cylinders);
                finished = true;
            } else {
                System.out.println("Please enter a valid number of cylinders to store.\n");
            }
        }

        System.out.println("\nThanks bye");

    }

    private Cylinder[][] getCylinderInformation(int noOfCylinders) {

        int cylinderNumber = 0;
        Cylinder[][] cylinders = new Cylinder[4][25];

        for (int i = 0; i < cylinders.length; i++) {
            for (int j = 0; j < cylinders[i].length; j++) {

                cylinderNumber++;
                int radius = findRadius(cylinderNumber);
                int height = findHeight(cylinderNumber);
                Cylinder cylinder = new Cylinder(radius, height);
                cylinders[i][j] = cylinder;

                if (cylinderNumber == noOfCylinders) {
                    return cylinders;
                }
            }
        }

        return cylinders;
    }

    private int findRadius(int cylinderNumber) {

        int radius = 0;

        while (radius <= 0) {
            System.out.println("Enter the radius for Cylinder " + cylinderNumber + " (must be greater than 0).");
            radius = parser.getInput();
        }

        return radius;
    }

    private int findHeight(int cylinderNumber) {

        int height = 0;

        while (height <= 0) {
            System.out.println("Enter the height for Cylinder " + cylinderNumber + " (must be greater than 0).");
            height = parser.getInput();
        }

        return height;
    }

    private void printCylinders(Cylinder[][] cylinders) {
        Cylinder cylinder;
        for (int i = 0; i < cylinders.length; i++) {
            for (int j = 0; j < cylinders[i].length; j++) {
                if (null != cylinders[i][j]){
                    cylinder = cylinders[i][j];
                    System.out.println("Stored at [" + i + "][" + j + "], " + cylinder.toString());
                }
            }
        }
    }
}
