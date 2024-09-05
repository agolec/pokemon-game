import utilities.InputValidation;
import utilities.PromptForNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        int lol;
        String input;
        input = PromptForNumber.promptUser(scan);
        while(!InputValidation.isNumeric(input)){
            input = PromptForNumber.promptUser(scan);
        }
        System.out.println("entered: \"" + Double.parseDouble(input) + "\".");
        System.out.println("end");
    }
}