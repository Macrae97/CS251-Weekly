package week3;

import java.util.Arrays;

public class GradeStatistics {

    public void run() {

        Parser parser = new Parser();

        int[] studentGrades;
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

            studentGrades = new int[students];
            studentGrades = getStudentGrades(parser, studentGrades, students);
            System.out.println("The grades are " + Arrays.toString(studentGrades));

            Arrays.sort(studentGrades);
            System.out.println("The average is: " + Arrays.stream(studentGrades).average().orElse(Double.NaN));
            System.out.println("The median is: " + getMedian(studentGrades));
            System.out.println("The minimum is: " + studentGrades[0]);
            System.out.println("The maximum is: " + studentGrades[studentGrades.length-1]);

            //convert int array to double
            double[] numArray = new double[studentGrades.length];
            for(int i=0; i<studentGrades.length; i++) {
                numArray[i] = studentGrades[i];
            }

            System.out.println("The standard deviation is: " + String.format("%.2f", getStandardDeviation(numArray)));

            finished = true;
        }
    }

    private int[] getStudentGrades(Parser parser, int[] studentGrades, int students) {
        if (students > 0) {
            for (int i = 0; i < students; i++) {
                int grade = -1;
                while(grade < 0 || grade > 100){
                    System.out.println("Enter the grade for student " + (i+1) + " (0-100");
                    grade = parser.getInput();
                }
                studentGrades[i] = grade;
            }
        } else {
            System.out.println("Number of students must be more than 0");
        }

        return studentGrades;
    }

    //code found at https://codippa.com/how-to-calculate-median-from-array-values-in-java/
    private double getMedian(int[] grades) {
        double median;
        // get count of scores
        int totalElements = grades.length;
        // check if total number of scores is even
        if (totalElements % 2 == 0) {
            int sumOfMiddleElements = grades[totalElements / 2] + grades[totalElements / 2 - 1];
            // calculate average of middle elements
            median = ((double) sumOfMiddleElements) / 2;
        } else {
            // get the middle element
            median = (double) grades[grades.length / 2];
        }
        return median;
    }

    //bits of code from https://www.programiz.com/java-programming/examples/standard-deviation
    private double getStandardDeviation(double numArray[]) {

        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }
        double mean = sum/length;
        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation/length);
    }

}
