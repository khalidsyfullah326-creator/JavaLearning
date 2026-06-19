package JavaLearning.OOP.Polymorphism.MethodOverloading.ChangingDataTypes;

// Class Adder contains overloaded methods to add numbers    
class Adder {    
    // Method to add two integers    
    static int add(int a, int b) {    
        return a + b;    
    }    
    // Method to add two doubles    
    static double add(double a, double b) {    
        return a + b;    
    }    
}    