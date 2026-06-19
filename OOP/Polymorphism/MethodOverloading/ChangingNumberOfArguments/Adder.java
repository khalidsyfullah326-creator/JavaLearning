package JavaLearning.OOP.Polymorphism.MethodOverloading.ChangingNumberOfArguments;

// Class Adder contains overloaded methods to add integers    
class Adder {    
    // Method to add two integers    
    static int add(int a, int b) {    
        return a + b;    
    }    
    // Method to add three integers    
    static int add(int a, int b, int c) {    
        return a + b + c;    
    }    
}    