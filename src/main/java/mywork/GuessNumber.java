// package mywork.javaproject;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int number = (int)(Math.random() * 101);
        Scanner input = new Scanner(System.in);

        int guess = -1;

        System.out.println("Guess a number between 0 and 100");

        while (guess != number) {

            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess < number) {
                System.out.println("Too low");
            } 
            else if (guess > number) {
                System.out.println("Too high");
            } 
            else {
                System.out.println("Correct! The number was " + number);
            }
        }
    }
}