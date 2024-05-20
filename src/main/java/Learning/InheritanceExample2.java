package Learning;

class Vehicle {

    public void doors(){
        System.out.println("The car has 4 doors");
    }
}

class Ferrari extends Vehicle{

    @Override
    public void doors(){
        System.out.println("The car has 2 doors");
    }

}



public class InheritanceExample2 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Ferrari ferrari = new Ferrari();

        vehicle.doors();

        ferrari.doors();


    }
}
