package utilities;

import java.util.InputMismatchException;

public class InputValidation {
    public static boolean isNumeric(String input){
        if(isStringNull(input) || input.isEmpty() || input.isBlank()){
            return false;
        }
        try{
            Double.parseDouble(input);
            return true;

        } catch(NumberFormatException e){
            System.out.print("ERROR: Unable to parse double from input String given. ");
            System.out.println(e.getMessage());
            return false;
        }
    }
    public static boolean stringIsBlank(String input){
        if(isStringNull(input)){
            return true;
        }
        return input.isEmpty();
    }
    private static boolean isStringNull(String input){
        return input == null;
    }
}
