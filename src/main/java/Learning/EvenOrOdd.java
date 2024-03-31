package Learning;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to be checked : ");
        int number = scanner.nextInt();

        // + : addition
        // - subtraction
        // * : multiplication
        // / : division
        // % : modulo operator
        // && : Logical And
        // || : Logical OR

        if (number % 2 == 0 ){
            System.out.println(number + " is Even");
        }else {
            System.out.println(number + " is odd");
        }

    }

}
