import java.util.Scanner;

public class ScanInput{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0; // sum রাখার জন্য

        System.out.println("Enter 100 numbers:");

        // 100 বার input নেওয়া হবে
        for (int i = 1; i <= 100; i++) {

            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt(); // user input

            sum = sum + num; // যোগ করা
        }

        // result print
        System.out.println("Total sum is: " + sum);

        input.close();
    }
}