package Learning;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a positive number (enter 0 to exit) : ");
            number = scanner.nextInt();
            if (number > 0 ){
                System.out.println("You entered a Positive number = " + number);
            }else if (number < 0){
                System.out.println("Please enter a Positive number ");
            }
        }while(number != 0);
        scanner.close();
        System.out.println("Program Exited");
    }
}
