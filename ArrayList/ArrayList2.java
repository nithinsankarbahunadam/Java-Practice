import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the index you wanna know");

        int index = scanner.nextInt();

        ArrayList<String> names = new ArrayList<>();

        names.add("Nithin");
        names.add("Chandhini");
        names.add("Thankam");
        names.add("Neethu");
        names.add("Mani");

        String element = names.get(index);

        System.out.println(element);

        scanner.close();


    }
    
}
