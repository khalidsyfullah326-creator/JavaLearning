package JavaLearning.OOP.Polymorphism;

public class Overloading {
    
    // Class Adder contains overloaded methods to add numbers  
class Adder {  
    // Method to add two integers and return an integer  
    static int add(int a, int b) {  
        return a + b;  
    }  
    // Method to add two integers and return a double  
    static double add(int a, int b) {  
        return a + b;  
    }  
}  
public class Main {  
    public static void main(String[] args) {  
        // This line of code will cause ambiguity because both add methods have the same signature  
        System.out.println(Adder.add(11, 11)); // Error: ambiguity  
    }
}
}  

