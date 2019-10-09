package week3;

import java.util.Arrays;

public class PrintArray {

    public void run() {

        Parser parser = new Parser();

        int[] numbers;
        int items = 0;
        boolean finished = false;

        while (!finished) {

            System.out.println("How many numbers are in the list?");

            try {
                //prompt user for input
                items = parser.getInput();
            } catch (NumberFormatException n) {
                System.err.println("Value entered is not valid");
            }

            numbers = new int[items];

            if (items > 0) {
                for (int i = 0; i < items; i++) {
                    System.out.println("Enter the value for item " + (i+1));
                    int num = parser.getInput();
                    numbers[i] = num;
                }
                System.out.println("The values are " + Arrays.toString(numbers));
                finished = true;
            } else {
                System.out.println("Number must be more than 0");
            }
        }
    }
}
