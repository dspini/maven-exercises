import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class DepManageExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String something = scanner.nextLine();
        System.out.println("You entered: " + scanner);
        System.out.println("\"" + something + "\" " + returnNumMessage(something) );
        System.out.println("Case flipped: " + StringUtils.swapCase(something));
        System.out.println("Lettera reversed: " + StringUtils.reverse(something));

    }

    public static String returnNumMessage(String input) {
        return(StringUtils.isNumeric(input)) ? "is a number" : "is not a number";

    }
}