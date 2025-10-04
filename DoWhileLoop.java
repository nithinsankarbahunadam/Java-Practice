public class DoWhileLoop {
public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("Iteration " + i);
            i++;
        } while (i <= 5);

        // infinite loop example
        /*
        do {
            System.out.println("This will run forever.");
        } while (true);
        */
    }
    
}
