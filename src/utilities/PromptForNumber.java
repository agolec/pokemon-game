package utilities;

import java.util.Scanner;

public class PromptForNumber {

    public static String promptUser(Scanner scan){
        String input;
        System.out.println("Enter a number: ");
        input = scan.nextLine();
        while(InputValidation.stringIsBlank(input)){
            System.out.println("name cannot be blank. Enter another string: ");
            input = scan.nextLine();
        }
        return input;
    }
}
