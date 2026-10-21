import java.util.Scanner;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    int s1, s2, s3;

    A(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    double getPercentage() {
        return (s1 + s2 + s3) / 3.0;
    }
}

class B extends Marks {
    int s1, s2, s3, s4;

    B(int s1, int s2, int s3, int s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    double getPercentage() {
        return (s1 + s2 + s3 + s4) / 4.0;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Student A (3 subjects)
        System.out.println("Enter marks for Student A (3 subjects):");
        System.out.print("Subject 1: ");
        int a1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int a2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int a3 = scanner.nextInt();

        // Input for Student B (4 subjects)
        System.out.println("\nEnter marks for Student B (4 subjects):");
        System.out.print("Subject 1: ");
        int b1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int b2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int b3 = scanner.nextInt();
        System.out.print("Subject 4: ");
        int b4 = scanner.nextInt();

        // Create objects and calculate percentages
        Marks studentA = new A(a1, a2, a3);
        Marks studentB = new B(b1, b2, b3, b4);

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Student A Percentage = " + studentA.getPercentage() + "%");
        System.out.println("Student B Percentage = " + studentB.getPercentage() + "%");

        scanner.close();
    }
}