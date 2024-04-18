package Learning;

import java.util.Scanner;

public class WhileExample {

    public static void main(String[] args) {
        int count = 1;

        // This is just to show how to create an infinite loop in Java using while
        //        while(true){ // an Infinite loop
        //            System.out.println("Current count is : " + count);
        //            count++; // this will increment the value by 1;
        //        }

        //        for (;;) {
        //            System.out.println("Congratulations, you have just created an infinite loop");
        //        }


        while(count <=10){
            System.out.println("Current count is : " + count);
            count++; // this will increment the value by 1;
        }
        System.out.println();
        System.out.println("Loop Finished, Good Bye !! ");
    }
}
