package com.company;

import java.util.Arrays;

public class numOfDivisors {
    public int[] solve(int[] A) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i< A.length; i++){
            if(max<A[i]){
                max = A[i];
            }
        }
        int[] count = new int[max+1];
        count[1] = 1;
        for(int i = 2; i<=max;i++){
            count[i]=2;
        }

        for(int i =2 ; i*i<=max; i++){
            for(int j = i*i; j<=max; j+=i ){
                count[j]++;
            }
        }
        System.out.println(Arrays.toString(count));
        int[] ans = new int[A.length];
        for(int i = 0;i<A.length; i++){
            ans[i] =count[A[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        numOfDivisors nd = new numOfDivisors();
        int[] A = {2,3,4,5};
        System.out.println(Arrays.toString(nd.solve(A)));
    }
}
