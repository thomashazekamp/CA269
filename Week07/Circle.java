public class Circle extends Shape {
    /* Author: Thomas Hazekamp
    Date: 23/02/2022
    Description: Task showing polymorphism */
    private double radius; // name inherited

    public Circle(String s, double r) {
        super(s); // use Shape constructor; effect is name=s;
        radius = r;
    }

    double area() {
        return Math.PI * (Math.pow(radius, 2));
    }
}