import java.util.Scanner;

public class Exception 
{
    public static void main(String[] args) 
    {
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a whole number to divide: ");
        int x = input.nextInt();
        System.out.println("Enter a whole number to devide by: ");
        int y = input.nextInt();
        int z = x/y;
        System.out.println("Result "+ z);

    }
    catch(ArithmeticException e)
    {
        System.out.println("You cannot divide by zero");
    }
    catch(java.util.InputMismatchException e)
    {
        System.out.println("You must enter a whole number");
    }
    catch(java.lang.Exception e)
    {
        System.out.println("An error has occured");
    }
    finally
    {
        System.out.println("Thank you Khalid");
    }
}
}
