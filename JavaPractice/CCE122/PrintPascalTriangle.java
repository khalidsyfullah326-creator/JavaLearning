import java.util.Scanner;

public class PrintPascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {            // ----- outer loop : each row -----
            int number = 1;                         // first value in every row

            // ----- leading spaces for centering -----
            for (int j = 0; j < n  - i ; j++) {
                System.out.print(" ");
            }

            // ----- inner loop : print the whole row -----
            for (int j = 0; j <= i; j++) {          // j goes from 0 to i (inclusive)
                System.out.print(number + " ");     // print current binomial coefficient

                // ----- compute next number in the same row -----
                //   number = C(i, j) * (i - j) / (j + 1) = C(i, j+1)
                number = number * (i - j) / (j + 1);
            }
            System.out.println();                    // finish the line after a row
        }

        input.close();
    }
}
