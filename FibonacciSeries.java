import java.util.Scanner;

public class FibonacciSeries {

    //Recursive function to print Fibonacci series up to n terms
   // Recursive function to find nth Fibonacci number
    public static int fibonacciMethod(int n) {
        if (n <= 1) {   // Base case: F(0)=0, F(1)=1
            return n;
        }
        return fibonacciMethod(n - 1) + fibonacciMethod(n - 2);  // Recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciMethod(n));

        sc.close();
    }


    
    
}
