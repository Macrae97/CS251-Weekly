package week3;

import java.util.Scanner;

public class Parser {

    private Scanner scanner;

    public Parser(){
        this.scanner = new Scanner(System.in);
    }

    //The next command from the user.
    public int getInput() {

        String inputLine;   // will hold the full input line
        int command = 0;

        System.out.print("> ");     // print prompt

        inputLine = scanner.nextLine();

        // Find up to two words on the line.
        java.util.Scanner tokenizer = new java.util.Scanner(inputLine);
        if (tokenizer.hasNext()) {
            command = Integer.valueOf(tokenizer.next());      // get first word
        }

        return command;
    }
}
