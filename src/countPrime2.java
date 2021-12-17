package com.company;

import java.util.Arrays;

public class countPrime2 {
    public int solve(int A) {
        int[] count = new int[A+1];

        for(int i = 2; i<=A; i++){
            for(int j = 2*i; j<=A; j+=i){
                count[j]++;
            }
        }
        System.out.println(Arrays.toString(count));

        int ans = 0;
        for(int i =1; i<=A; i++){
            if(count[i]==2){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        countPrime2 cp = new countPrime2();
        System.out.println(cp.solve(8));;
    }
}
