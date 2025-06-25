public class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
    double getCircumference() {
        return 2 * Math.PI * radius;
    }
    void displayDetails() {
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + getArea());
        System.out.println("Circumference : " + getCircumference());
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(7.0);
        c1.displayDetails();
    }
}
