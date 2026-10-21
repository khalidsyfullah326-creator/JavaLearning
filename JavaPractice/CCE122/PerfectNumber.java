import java.util.Scanner;
public class PerfectNumber {//perfect number is a positive integer that is equal to the sum of its proper positive divisors, excluding the number itself. For example, 6 is a perfect number because its divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.
    public static boolean IsPerfect(int n){
        int sum = 0;
        for(int i=1; i<n; i++)
        {
            if( n%i == 0){
                sum += i;
            }
        }
        if(sum == n && n !=0){
            return true;
        }
        else{
            return false;
        }
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if(IsPerfect(number)){
                System.out.println(number + " is a perfect number.");
            }
            else{
                System.out.println(number + " is not a perfect number.");
            }
        }
    }
