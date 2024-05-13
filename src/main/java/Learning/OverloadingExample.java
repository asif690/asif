package Learning;

public class OverloadingExample {

    //method to add two integers
     public int add(int a, int b){
        return a+b;
    }

    // usually, Whenever we talk about the method overloading we are referring as the parameters change in the method.

    //method to add three integers
    public int add(int a, int b,int c){
        return a+b+c;
    }




    public static void main(String[] args) {

        OverloadingExample example = new OverloadingExample();

        // Call the method with two integers
        int sum1 = example.add(5,6);
        System.out.println("Sum of Two integers " + sum1);


        // Call the method with three integers
        int sum2 = example.add(5,6,7);
        System.out.println("Sum of Two integers " + sum2);



    }
}
