package Learning;

public class ConstrcutorExample1 {

    // Constructor name should be same as the class name
    // A constructor must not have any return type
    // A constructor cannot be abstract, static, final and synchronized.

    // <class_name>(){}

    // 1) default constructor  2) parameterized  constructor

    ConstrcutorExample1(){
        System.out.println("Object creation");
    }

    public static void main(String[] args) {
        // here we are calling a default constructor
        ConstrcutorExample1 c1 = new ConstrcutorExample1();

    }
}
