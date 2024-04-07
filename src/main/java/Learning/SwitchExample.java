package Learning;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a choice between 1-3 : ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1 :
                System.out.println("you chose 1");
                break;
            case 2 :
                System.out.println("you chose 2");
                break;
            case 3 :
                System.out.println("you chose 3");
                break;
            default:
                System.out.println("you chose the wrong number");
        }

        scanner.close();
    }
}
