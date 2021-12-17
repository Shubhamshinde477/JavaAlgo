package com.company;

import java.util.Arrays;

public class maximumSubsetValue {
    public int solve(int[] A, int B) {
        int N = A.length;
        long sum1 = 0;
        long sum2 = 0;
        long sum3 = 0;



        Arrays.sort(A);

        for(int i = 0; i<A.length;i++){
            sum1 = sum1 + A[i];
        }

        for(int i = N-1; i>=B ;i--){
            sum2 = sum2+A[i];

        }
        for(int i = 0; i<N-B; i++){
            sum3 = sum3+A[i];
        }
        int sum = (int) Math.max(Math.abs(2*sum3-sum1),Math.abs(2*sum2-sum1));

        return sum;


    }

    public static void main(String[] args) {
        maximumSubsetValue ms = new maximumSubsetValue();
        int[] A = {70, 21, 7, 64, 44, 79, 50, 89, 68, 23, 20, 50, 65, 64, 48, 3, 46, 87};
        int B = 16;
        System.out.println(ms.solve(A,B));;
    }
}
