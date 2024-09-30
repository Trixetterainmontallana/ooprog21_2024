import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle(); 

        a.setRadius(3);
        printCircleDetails("first", a);

        System.out.print("Enter radius for the second circle: ");
        double userRadius = scanner.nextDouble();
        b.setRadius(userRadius);
        printCircleDetails("second", b);
        
        scanner.close();
    }

    private static void printCircleDetails(String circleName, Circle circle) {
        System.out.println("Radius of the " + circleName + " circle: " + Circle.getRadius());
        System.out.println("Diameter of the " + circleName + " circle: " + Circle.getDiameter());
        System.out.println("Area of the " + circleName + " circle: " + Circle.getArea());
        System.out.println();
    }
}
