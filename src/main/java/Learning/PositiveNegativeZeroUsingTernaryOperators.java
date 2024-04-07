package Learning;

import java.util.Objects;
import java.util.Scanner;

public class PositiveNegativeZeroUsingTernaryOperators {

   /**
    * (you if condition) ? (result of that if condition)
    * : (Is used for other cases)
    */


    public static void checkNumber(int number){
        String result = (number > 0) ? "positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        checkNumber(number);
        scanner.close();
    }
}
