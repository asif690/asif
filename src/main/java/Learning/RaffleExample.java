package Learning;

import java.util.Random;
import java.util.Scanner;

public class RaffleExample {
    public static void main(String[] args) {

        Random random = new Random(); // Whenever you need to generate a random number you use the class Random
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Raffle game ! Press enter to get your Raffle Number or Type 'exit' to quit the game ");

        while (true){
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for playing ! GoodBye !");
                break;
            }

            int raffleNumber = random.nextInt(99) + 1;  // This will generate the random numbers between 1 - 99

            System.out.println("Your Raffle Number is :" + raffleNumber);

            if (raffleNumber == 13 || raffleNumber == 67) {
                System.out.println("Congratulations ! You have Won the price of 1 Million Dollars");
                break; // Exiting the loop if the winning number is found.
            }

            System.out.println("Press Enter to get another Raffle Number or Type 'exit' to quit the game ");
        }

        scanner.close();

    }
}
