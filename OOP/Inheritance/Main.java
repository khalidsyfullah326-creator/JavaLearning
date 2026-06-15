package JavaLearning.OOP.Inheritance;

public class Main {
    public Main() {
   }

   public static void main() {
      Animal bird = new Animal();
      bird.identity();
      bird.speak();
      Cat OrangeCat = new Cat();
      System.out.println("Orange Cat:");
      OrangeCat.identity();
      OrangeCat.speak();
      OrangeCat.eat();
      Dog Garmanshepard = new Dog();
      System.out.println("Garmanshepard:");
      Garmanshepard.speak();
      Garmanshepard.identity();
   }
}