public class TwoDArray {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        int[][] anotherMatrix = new int[3][];

        anotherMatrix[0] = new int[3];
        anotherMatrix[0][0] = 1;
        anotherMatrix[0][1] = 2;
        anotherMatrix[0][2] = 3;

        anotherMatrix[1] = new int[2];
        anotherMatrix[1][0] = 4;
        anotherMatrix[1][1] = 5;

        anotherMatrix[2] = new int[3];
        anotherMatrix[2][0] = 7;
        anotherMatrix[2][1] = 8;
        anotherMatrix[2][2] = 9;




        

    }
    
}
