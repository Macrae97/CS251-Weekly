package week3;

import java.util.Arrays;

public class GradeStatistics {

    public void run() {

        Parser parser = new Parser();

        int[] grades;
        int students = 0;
        boolean finished = false;

        while (!finished) {

            System.out.println("Enter the number of students in the class.");

            try {
                //prompt user for input
                students = parser.getInput();
            } catch (NumberFormatException n) {
                System.err.println("Value entered is not valid");
            }

            grades = new int[students];

            if (students > 0) {
                for (int i = 0; i < students; i++) {
                    int grade = -1;
                    while(grade < 0 || grade > 100){
                        System.out.println("Enter the grade for student " + (i+1) + " (0-100");
                        grade = parser.getInput();
                    }
                    grades[i] = grade;
                }
                System.out.println("The values are " + Arrays.toString(grades));
                finished = true;
            } else {
                System.out.println("Number of students must be more than 0");
            }
        }
    }
}
