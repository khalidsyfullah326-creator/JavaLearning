
import java.util.Scanner;
public class AverageFunction {
    public static int average(int a, int b, int c){
     return (a + b + c)/3;  
    }
    public static void main(String[] args) {
        System.out.println("Enter 3 integer numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int avg = average(a, b, c);
        System.out.println("Average value of those three numbers is: "+avg);

        
    }


}
