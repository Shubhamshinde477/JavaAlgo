package com.company;

import java.util.Arrays;

public class deleteOne {
    public int solve(int[] A) {
        int N = A.length;
        int[] prefix = new int[A.length];
        int[] suffix = new int[A.length];
        prefix[0]= A[0];
        suffix[N-1] = A[N-1];


        for(int i = 1; i<N; i++){
            prefix[i] = gcd(prefix[i-1],A[i]);


        }
        for(int j = N-2; j>=0; j--){
            suffix[j] = gcd(suffix[j+1],A[j]);


        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));



        int ans = 0;

        for(int i = 1; i<N-1; i++){
            int max = gcd(prefix[i-1], suffix[i+1]);
            System.out.println(max);
            ans = Math.max(ans,max);
        }
        return ans;
    }

    public int gcd(int A, int B){
        if(A>B){
            A = A^B;
            B = A^B;
            A = A^B;
        }
        while(A>0){
            int temp = A;
            A = B%A;
            B = temp;
        }
        return B;
    }

    public static void main(String[] args) {
        deleteOne deo = new deleteOne();
        int[] A = {21, 7};
        System.out.println(deo.solve(A));

    }
}
