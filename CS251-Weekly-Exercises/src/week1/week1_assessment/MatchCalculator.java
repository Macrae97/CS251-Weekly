package week1.week1_assessment;

import java.util.ArrayList;
import java.util.Random;

public class MatchCalculator {

    public MatchCalculator(){
    }

    public void calculate(int numberOfPeople){

        int numberOfMatches = 0;

        // Stores people's birthdays
        ArrayList<Integer> birthdays = new ArrayList<>();
        //random to be used to generate random birthdays
        Random random = new Random();

        // Populates the birthdays array
        for (int personNumber = 0; personNumber < numberOfPeople; personNumber++) {
            int birthday = random.nextInt(365) + 1;
            birthdays.add(birthday);
        }

        // Checks each person's birthday against everyone else's
        for (int i = 0; i < birthdays.size(); i++) {
            for (int j = i + 1; j < birthdays.size(); j++) {
                // If it finds a birthday match, increment numberOfMatches and break out of loop
                if ((birthdays.get(i).equals(birthdays.get(j)))) {
                    numberOfMatches += 1;
                    break;
                }
            }
        }

        //calculate percentage
        double matchPercentage = ((double)numberOfMatches / numberOfPeople * 100);

        //print results
        System.out.println( "Out of " + numberOfPeople +
                            " the number of birthday matches " + numberOfMatches +
                            ". A match rate of " + String.format("%.2f", matchPercentage) + "%.");
    }

}
