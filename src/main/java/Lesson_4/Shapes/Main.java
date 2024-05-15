package Lesson_4.Shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red", "Black");
        Rectangle rectangle = new Rectangle(4, 6, "Blue", "Green");
        Triangle triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

        System.out.println("Circle:");
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Fill Color: " + circle.getFillBackground());
        System.out.println("Border Color: " + circle.getBorderColor());

        System.out.println("Rectangle:");
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Fill Color: " + rectangle.getFillColor());
        System.out.println("Border Color: " + rectangle.getBorderColor());

        System.out.println("Triangle:");
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Fill Color: " + triangle.getFillColor());
        System.out.println("Border Color: " + triangle.getBorderColor());
    }
}
