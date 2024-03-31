package Learning;

public class WrapperExample {
    public static void main(String[] args) {

        //primitive data type

        int premitiveInt = 2024;

        // Converting an int to an object
        Integer wrappedInt = Integer.valueOf(premitiveInt);

        //converting an Object to an int.
        int unwrappedInt = wrappedInt.intValue();

        System.out.println(premitiveInt);
        System.out.println(wrappedInt);


    }
}
