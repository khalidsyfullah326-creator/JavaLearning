import java.util.Scanner;
public class FactorialNumber {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        else if (n == 0) {
            System.out.println("Factorial of 0 is: 1");
            return;
        }
    
       int factorial = 1;
       for (int i= n; i>= 1; i--){
        factorial = factorial * i;
       }
       System.out.println("Factorial of " + n + " is: " + factorial);
    }
    public static void main(String[] args) {
        while (true) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printFactorial(n);

    }

    
}
}
