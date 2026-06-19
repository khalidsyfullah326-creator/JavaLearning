package JavaLearning.OOP.Abstrarction;

public class Rectangle extends Shape {
    double width;
    double height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return  width * height;
    }
    @Deprecated
    void display() { // CONCRETE METHOD which is inherited
        System.out.println("This is the shape of Rectangle");
    }
}

