package Lesson_4.Shapes;

public interface Shape {
    double calculatePerimeter();
    double calculateArea();

    default double getPerimeter() {
        return calculatePerimeter();
    }

    default double getArea() {
        return calculateArea();
    }
}