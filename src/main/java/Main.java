
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter something: ");
        String userInput = sc.nextLine();

        boolean isNum;

        if (!StringUtils.isNumeric(userInput)) {
            System.out.println("You Entered: \"" + userInput + "\"");
            System.out.println("\"" + userInput + "\"" + " is not a number");
            System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
            System.out.println("REVERSED case: " + StringUtils.reverse(userInput));
        } else if (StringUtils.isNumeric(userInput)){
            System.out.println("you entered a number");
        }

    }
}
