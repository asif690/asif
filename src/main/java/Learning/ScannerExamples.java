package Learning;

import java.util.Scanner;

public class ScannerExamples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // scanner is used for taking the user input

        System.out.println("enter your exact GPA (GPA SHOULD BE 1.0-4.0)" );
        float gpa = scanner.nextFloat();

        System.out.println("Are you a Student");
        boolean isStudent = scanner.nextBoolean();

        if ( gpa >= 3.9 && isStudent){
            System.out.println("you get the scholarship");
        }else {
            System.out.println("work harder ! No scholarship for you !  ");
        }






    }

}
