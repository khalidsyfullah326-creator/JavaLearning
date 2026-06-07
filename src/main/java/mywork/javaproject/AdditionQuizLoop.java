// package mywork.javaproject;

import java.util.Scanner;

public class AdditionQuizLoop {
    public static void main(String[] args) {

        // দুইটা random single digit number নেওয়া
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int correctAnswer = number1 + number2;
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        while (answer != correctAnswer) {
            System.out.print("Wrong answer. Try again: ");
            answer = input.nextInt();
        }
        System.out.println("Correct!");

        input.close();
    }
}
