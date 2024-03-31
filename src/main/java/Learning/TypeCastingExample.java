package Learning;

public class TypeCastingExample {
    public static void main(String[] args) {

        int x = 20;
        double y = x;
        System.out.println("This is an Example of Implicit Casting (Widening) : " +  y);

        System.out.println();

        double a = 255.98;
        int b = (int)a;
        System.out.println("This is an Example of Explicit Casting (Narrowing) : " +  b);

        double typecastofLong = 12342423423f;

        float z = (float) typecastofLong;

        System.out.println(z);




    }
}
