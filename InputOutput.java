import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        Scanner bin = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = bin.nextLine();

        System.out.print("Enter your age: ");
        int age = bin.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        bin.close();
    }


    
}
