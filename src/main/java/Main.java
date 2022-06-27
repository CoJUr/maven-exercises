
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some words: ");
        String userInput = sc.nextLine();

        boolean isNum;

        if (!StringUtils.isNumeric(userInput)) {
            System.out.println("that is not a number");
            System.out.println("Look at this- your words with swapped casing: " + StringUtils.swapCase(userInput));
            System.out.println("Heres another trick- your input REVERSED: " + StringUtils.reverse(userInput));
        } else {
            System.out.println("you entered a number");
        }

    }
}
