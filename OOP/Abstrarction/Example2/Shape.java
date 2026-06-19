package JavaLearning.OOP.Abstrarction;

public abstract class Shape {
    abstract double area();//abstract method
    void display() { // CONCRETE METHOD which is inherited
        System.out.println("This is the shape display");
    }
}