import java.util.Scanner;
class PrimeNumber{//prime number is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers. A prime number is only divisible by 1 and itself. For example, 2, 3, 5, 7, 11 are prime numbers.
    public static boolean Isprime(int n){
        if(n<=1){
            return false;// 1 and negative numbers are not prime
        }
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0){
                return false;
            }
        }
            return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if(Isprime(number)){
            System.out.println(number +" is a prime number.");
        }
        else{
            System.out.println(number +" is not a prime number.");
        }
    }
}