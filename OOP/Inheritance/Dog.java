package JavaLearning.OOP.Inheritance;

public class Dog extends Animal {
    public Dog() {
    }

    void identity() {
        System.out.println("this is child class");
    }

    void speak() {
        System.out.println("Woof");
    }
    void eat() {
        System.out.println("Eating dog food");
    }
    
}
