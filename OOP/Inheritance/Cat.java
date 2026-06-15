package JavaLearning.OOP.Inheritance;

public class Cat extends Animal {
    public Cat() {
    }

    void identity() {
        System.out.println("this is child class");
    }

    void speak() {
        System.out.println("Meow");
    }
    void eat() {
        System.out.println("Eating cat milk");
    }
    
}
