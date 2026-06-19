package JavaLearning.OOP.Abstrarction;

public class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;

    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    void display() {
        System.out.println("This is the shape of Circle");
    }
}
