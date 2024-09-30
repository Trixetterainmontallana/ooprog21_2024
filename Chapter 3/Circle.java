public class Circle {

    private static double radius;
    private static double diameter;
    private static double area;

    public Circle() {
        radius = 1;
        calculateDiameter();
        computesArea();
    }

    public void setRadius(double rad) {
        radius = rad;
        calculateDiameter();
        computesArea();
    }

    private void calculateDiameter() {
        diameter = 2 * radius;
    }

    private void computesArea() {
        area = Math.PI * radius * radius;
    }

    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }
}
