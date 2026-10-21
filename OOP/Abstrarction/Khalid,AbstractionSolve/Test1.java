// 1. Write a console based program to implement polymorphism using inheritance. Consider the
//example of Shape as base class with method show(). And then a child class Circle and Rectangle
//which inherit the base class Shape and override its method show(). Add one more Method with
//the name of getInfo(). This method would display the class name in which it is implemented. Do
//not override this method. When you will call the method getInfo() with child object it would still
//show the name of the base class, which implies that method has been directly inherited and was
//not overridden.
public class Test1 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.show();       // Polymorphism in action
        s1.getInfo();    // Still shows "Shape"
        s2.show();
        s2.getInfo();
    }
}