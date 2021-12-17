package com.company;

public class minSubarraySum {
    public int solve(int[] A, int B) {

        int sum = 0;
        int least = Integer.MAX_VALUE;

        for(int i = 0; i<=B-i;i++){
            sum = sum+A[i];
        }
        least = sum;
        int index = 0;
        for(int i = 1; i<A.length-B;i++){
            int j = i+B-1;
            sum = sum-A[i-1]+A[j];

            System.out.println(sum);
            if(sum<least){
                least = sum;
                index = i;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        minSubarraySum mss = new minSubarraySum();
        int[] A = {20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11};
        int B = 9;
        System.out.println(mss.solve(A,B));
    }
}
