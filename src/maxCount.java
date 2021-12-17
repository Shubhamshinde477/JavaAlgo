package com.company;

public class maxCount {
    public int solve(int[][] A) {
        int col = A[0].length;
        int row = A.length;
        int i = 0;
        int count = 0;
        int j = A.length-1;

       while(i<row && j>=0 ){
            if( A[i][j]==1 ){

                count++;
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println(count);
        int index = 0;
        for(int k =0; k<row; k++){
            if(A[k][col-count]==1){
                index = k;
                break;
            }
        }

        return index;

    }

    public static void main(String[] args) {
        maxCount mc = new maxCount();
        int[][] A = {
  {0, 0, 0, 0, 0, 1, 1, 1, 1},
  {0, 0, 0, 0, 0, 1, 1, 1, 1},
  {0, 0, 0, 0, 0, 1, 1, 1, 1},
  {0, 0, 0, 0, 0, 0, 1, 1, 1},
  {0, 0, 0, 0, 0, 0, 1, 1, 1},
  {0, 0, 0, 1, 1, 1, 1, 1, 1},
  {0, 0, 0, 0, 1, 1, 1, 1, 1},
  {0, 0, 0, 1, 1, 1, 1, 1, 1},
  {0, 0, 0, 1, 1, 1, 1, 1, 1},
};
        System.out.println(mc.solve(A));
    }
}
