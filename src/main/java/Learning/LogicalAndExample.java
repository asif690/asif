package Learning;

import java.util.Scanner;

public class LogicalAndExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // scanner is used for taking the user input

        System.out.println("Enter your age please : ");
        int age = scanner.nextInt();

        System.out.println("Are you a Citizen? (Give the value True for Yes and false for No)");
        boolean isCitizen = scanner.nextBoolean();

        if (age >= 18 && isCitizen){
            System.out.println("Congratulations, You are eligible to vote ! ");
        }else {
            System.out.println("Sorry, No voting for you ! ");
        }

        scanner.close();
    }

}
