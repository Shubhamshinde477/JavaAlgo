package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class minimumAndMaximumSubsequence {
    public int solve(ArrayList<Integer> A) {
        long maxSum =0;
        long minSum = 0;
        int C = 7 + (int) (Math.pow(10,9));

        int N = A.size();
        long sum = 0;

        for(int i = 0; i<A.size(); i++){
            maxSum = maxSum + (1L<<i)*A.get(i);
            System.out.println("maxSum = "+maxSum);
            minSum = minSum + (1L<<(N-1-i))*A.get(i);
            System.out.println("minSum = "+minSum);

        }
        sum = sum + maxSum-minSum;


        if(sum>0 && sum< C){
            return (int)sum;
        }
        else return (int)(sum%C);


    }

    public static void main(String[] args) {
        minimumAndMaximumSubsequence mma = new minimumAndMaximumSubsequence();
        ArrayList<Integer>A = new ArrayList<Integer>(Arrays.asList(2,5,1));
        System.out.println(mma.solve(A));  ;
    }
}
