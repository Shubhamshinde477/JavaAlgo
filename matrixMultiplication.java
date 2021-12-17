import java.util.Arrays;

public class matrixMultiplication {
    public int[][] solve(int[][] A, int[][] B) {
        int rowA = A.length;
        int colA = A[0].length;
        int rowB = B.length;
        int colB = B[0].length;
        int[][] C = new int[rowA][colB];

        for(int i = 0 ; i< rowA ; i++){

            for(int j = 0 ; j<colB ; j++){

                C[i][j] = 0;

                for(int k = 0; k< colA; k++){

                    C[i][j] =  C[i][j]+ A[i][k]+B[k][j];

                }

            }

        }
        return C;
    }

    public static void main(String[] args) {
        matrixMultiplication mm = new matrixMultiplication();
        int[][] A= {{94, 91}};
        int[][] B = {{35, -52, -12, 26, -93, -61},{29, -20, -36, -9, 66, 15}};
        System.out.println(Arrays.toString(mm.solve(A,B)));
    }
}
