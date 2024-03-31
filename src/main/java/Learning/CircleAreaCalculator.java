package Learning;

public class CircleAreaCalculator {

    public static void main(String[] args) {

        int radiusInt = 5;
        float radiusFloat = 5.0f;
        double radiusDouble = 5.0;

        double areaInt = calculateArea(radiusInt);
        System.out.println("Area of  the circle : " + (int)areaInt);

        double areFloat = calculateArea(radiusFloat);
        System.out.println("Area of  the circle : " + (float)areFloat);

        double areDouble = calculateArea(radiusDouble);
        System.out.println("Area of  the circle : " + areDouble);

    }

    public static double calculateArea(int radius){
        return Math.PI * radius * radius;
    }

    public static double calculateArea(float radius){
        return Math.PI * radius * radius;
    }

    public static  double calculateArea(double radius){
        return Math.PI * radius * radius;
    }

}
