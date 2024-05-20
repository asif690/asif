package Learning;

//parent class
class  Animal{
    //String animalSound = "Some Animal Sound";

    public void noOfEyes(){
        System.out.println("Most Animal has 2 eyes"); // This as an implementation.
    }
}

//Sub class or child class Spider inheriting from Animal
class Spider extends Animal{

    @Override
    public void noOfEyes(){
        System.out.println("Spider has more than 2 eyes");
    }

    public void legs(){
        System.out.println("Spider has 8 legs");
    }

}


public class InheritanceExample {
    public static void main(String[] args) {

        Animal animal = new Animal();  // parent class object
        Spider spider = new Spider();  // Child class object

        animal.noOfEyes();
        spider.noOfEyes();

        //upcasting
        Animal animal1 = new Spider();
        animal1.noOfEyes();

    }
}
