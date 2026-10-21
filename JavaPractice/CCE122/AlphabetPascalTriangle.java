import java.util.Scanner;
class AlphabetPascalTriangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {            // ----- outer loop : each row -----
            // ----- leading spaces for centering -----
            for (int j = 0; j < n  - i ; j++) {
                System.out.print(" ");
            }

            /* ----- build and print the current row ----- */
            for (int j = 0; j <= i; j++) {        // position within the row
                char ch;
                if (j == 0 || j == i) {           // first or last element → 'A'
                    ch = 'A';
                } else if (j <= i / 2) {          // left half of the middle section
                    ch = (char) ('A' + j);
                } else {                          // right half – mirror the left
                    ch = (char) ('A' + (i - j));
                }
                System.out.print(ch + " ");
            }
            System.out.println();                    // finish the line after a row
        }

        input.close();
    }
}