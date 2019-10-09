package week3;

public class Main {

    public static void main(String[] args){

        int choice = 0;
        Parser parser = new Parser();

        while (choice != 3){
            System.out.println("\nDo you want to run " +
                    "\n1).PrintArray " +
                    "\n2.)GradeStatistics" +
                    "\n3.)Quit");
            choice = parser.getInput();
            if (choice == 1){
                PrintArray printArray = new PrintArray();
                printArray.run();
            }else if(choice == 2) {
                GradeStatistics gradeStatistics = new GradeStatistics();
                gradeStatistics.run();
            }
        }

        System.out.println("Thanks bye");
    }

}
