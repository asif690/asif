package Learning;

public class ConstrcutorExample3 {
    String name;
    int id;

    public ConstrcutorExample3(String Firstname, int Emp_id) {
        name = Firstname;
        id = Emp_id;
        // this key word in java


    }

    public ConstrcutorExample3() {

    }


    public void display(){
        System.out.println("ID: " + id + " Name: " + name);
    }

    public static void main(String[] args) {
        ConstrcutorExample3 c1 = new ConstrcutorExample3();

        ConstrcutorExample3 c2 = new ConstrcutorExample3("Alex",123);
        ConstrcutorExample3 c3 = new ConstrcutorExample3("Alexa",124);

        c1.display();
        c2.display();
        c3.display();



    }
}
