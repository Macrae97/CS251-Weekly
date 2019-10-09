package week1.week1_assessment;

import java.util.ArrayList;
import java.util.Random;

public class MatchCalculator {

    public MatchCalculator(){}

    private int numberOfMatches = 0;

    public void calculate(int numberOfPeople){

        ArrayList<Integer> birthdays = new ArrayList<>(); // Stores people's birthdays

        // Populates the birthdays array
        for (int personNumber = 0; personNumber < numberOfPeople; personNumber++) {
            birthdays.add(getRandInt(1, 365));
        }
        // Checks each person's birthday against everyone else's
        for (int i = 0; i < birthdays.size(); i++) {
            for (int j = i + 1; j < birthdays.size(); j++) {
                // If birthdays match, marks trial as a success jumps to next trail
                if ((birthdays.get(i).equals(birthdays.get(j)))) {
                    numberOfMatches += 1;
                    break;
                }
            }
        }

        double matchPercentage = ((double)numberOfMatches / numberOfPeople * 100);

        System.out.println("Out of " + numberOfPeople + " the number of birthday matches " + numberOfMatches + ". A match rate of " + matchPercentage + "%.");
    }

    private int getRandInt(int lowerBound, int upperBound) {

        // Returns random integer between lowerBound and upperBound
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}
