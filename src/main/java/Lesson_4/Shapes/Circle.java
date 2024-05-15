package Lesson_4.Shapes;

public class Circle implements Shape {
    private double radius;
    private String fillBackground;
    private String borderColor;

    public Circle(double radius, String fillBackground, String borderColor) {
        this.radius = radius;
        this.fillBackground = fillBackground;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public String getFillBackground() {
        return fillBackground;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
