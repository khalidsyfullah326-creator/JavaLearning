//import java.util.Scanner;
public  class FloydsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = input.nextInt();
        int number = 1; // Initialize the starting number
        for(int i = 1; i<= n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(number +" ");
                number++;
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}