package Learning;

public class ConstrcutorExample2 {

    String name;
    int id;

    public void display(){
        System.out.println("ID: " + id + " Name: " + name);
    }

    public static void main(String[] args) {
        ConstrcutorExample2 c1 = new ConstrcutorExample2();
        ConstrcutorExample2 c2 = new ConstrcutorExample2();

        c1.display();
        c2.display();


    }
}
