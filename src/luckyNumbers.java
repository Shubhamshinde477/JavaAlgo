package com.company;

import java.util.Arrays;

public class luckyNumbers {
    public int solve(int A) {

        boolean[] prime = new boolean[A+1];
        int[] count = new int[A+1];
        for(int i = 2; i*i<=A;i++){
            for(int j = i*i; j<=A; j+=i){
                prime[j] = true;
            }
        }
        System.out.println(Arrays.toString(prime));

        for(int i = 2; i<=A; i++){
            for(int j = 2; j<=A; j++){
                if(prime[j]==false && i%j==0){
                    count[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(count));
        int ans = 0;
        for(int i =2; i<=A;i++){
            if(count[i]==2){
                ans++;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        luckyNumbers ln = new luckyNumbers();
        System.out.println(ln.solve(12));
    }
}
