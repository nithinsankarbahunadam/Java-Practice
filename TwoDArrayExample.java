public class TwoDArrayExample {

    public static void main(String[] args) {

        int[][] studentArray = new int[3][];

        studentArray[0] = new int[5];
        studentArray[0][0] = 68;
        studentArray[0][1] = 70;
        studentArray[0][2] = 78;
        studentArray[0][3] = 85;
        studentArray[0][4] = 90;

        studentArray[1] = new int[4];
        studentArray[1][0] = 78;
        studentArray[1][1] = 82;
        studentArray[1][2] = 88;
        studentArray[1][3] = 95;

        studentArray[2] = new int[3];
        studentArray[2][0] = 80;
        studentArray[2][1] = 85;
        studentArray[2][2] = 90;



        for (int i = 0; i < studentArray.length; i++) {

            System.out.print("Student " + (i + 1) + " scores: ");

            for (int j = 0; j < studentArray[i].length; j++) {

                System.out.print(studentArray[i][j] + " ");
            }
            
            System.out.println();
        }
        
    }
    
}
