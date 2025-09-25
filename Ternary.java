import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");

        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        // Using ternary operator to find the maximum of two numbers
        int max = (a > b) ? a : b;

        System.out.println("The maximum is " + max);

        scanner.close();

       
    }
    
}
