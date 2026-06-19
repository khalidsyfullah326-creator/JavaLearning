package JavaLearning.OOP.Abstrarction;

public class Main {

    /*abstract - Used to define abstract classes and methods.
    Abstraction is the process of hiding implementation details
    and showing only the essential features;
    Abstract classes CAN'T
    Can contain 'abstract'
    Can contain 'concrete'
    be instantiated directly
    methods (which must be implemented)
    methods (which are inherited)*/
    static void main() {
        Triangle t = new Triangle(6,5);
        Circle c = new Circle(9);
        Rectangle r = new Rectangle(2,4);
        
        r.display();
          System.out.println("Area of Rectangle is: " + r.area());
        c.display();
        System.out.println("Area of Circle is: " + c.area());
        t.display();
        System.out.println("Area of Triangle is: " + t.area());

    }

}
