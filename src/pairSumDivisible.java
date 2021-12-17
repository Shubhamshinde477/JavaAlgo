package com.company;

import java.util.Arrays;

public class pairSumDivisible {
    public int solve(int[] A, int B) {
        int N = A.length;
        int[] C = new int[B];

        for(int i = 0; i< N; i++){
            C[A[i]%B]++ ;
        }
        System.out.println(Arrays.toString(C));
        int ans = 0;

        ans += (C[0]*(C[0]-1))/2;

        for(int i=1; i<(B-1)/2;i++){
            ans+=C[i]*C[B-i];
        }
        if(B%2==0){
            ans+= (C[B/2]*(C[B/2]-1)/2);
        }
        return ans;


    }

    public static void main(String[] args) {
        pairSumDivisible ps = new pairSumDivisible();
        int[] A = { 93, 9, 46, 79, 56, 24, 10, 26, 9, 93, 31, 93, 75, 7, 4, 80, 19, 67, 49, 84, 62, 100, 17, 40, 35, 84, 14, 81, 99, 31, 100, 66, 70, 2, 11, 84, 60, 89, 13, 57, 47, 60, 59, 60, 42, 67, 89, 29, 85, 83, 42, 47, 66, 80, 88, 85, 83, 82, 16, 23, 21, 55, 26, 2, 21, 92, 85, 26, 46, 3, 7, 95, 50, 22, 84, 52, 57, 44, 4, 23, 25, 55, 41, 49};
        int B = 37;
        System.out.println(ps.solve(A,B));;
    }
}
