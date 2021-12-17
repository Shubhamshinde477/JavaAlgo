package com.company;

import java.util.Arrays;

public class rotateArray90 {
    public void solve(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < A[0].length; j++) {
                temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        System.out.println(Arrays.toString(A[0]));

        for (int i = 0; i < A.length; i++) {
            int j = 0;
            int k = A[0].length - 1;
            int temp = 0;
                while (j < k) {
                    temp = A[i][j];
                    A[i][j]= A[i][k];
                    A[i][k] = temp;

                    j++;
                    k--;
                }
        }
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        rotateArray90 ro = new rotateArray90();
        int[][] A = {{1,2},{3,4}};
        ro.solve(A);
    }
}
