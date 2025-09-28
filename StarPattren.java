public class StarPattren {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

                int spasesNumber = 5 - i;

            for ( int j = 1; j <= spasesNumber; j++){

                System.out.print(" ");
                
   
            }

            for (int k = 1; k <= i; k++) {

                System.out.print("* ");

            }

            System.out.println();
   
    }
    
}

}
