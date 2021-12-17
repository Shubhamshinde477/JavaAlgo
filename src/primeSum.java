package com.company;

import java.util.Arrays;

public class primeSum {
    public int[] primesum(int A) {

        boolean[] prime = new boolean[A+1];
        for(int i = 1; i<=A; i++){
            prime[i] = true;
        }


        for(int i = 2; i*i<=A;i++){
            if (prime[i]){
                for(int j = i*i; j<=A; j+=i){
                    prime[j]= false;
                }
            }

        }



        int[] ans = new int[2];

        for(int i = 1; i<=A; i++){

            if(prime[i] && prime[A-i]){
                if(i==1){
                    continue;
                }else{

                    ans[0]=i;
                    ans[1] =A-i;
                    break;
                }
                        }
        }
        return ans;
    }

    public static void main(String[] args) {
        primeSum ps = new primeSum();
        System.out.println(Arrays.toString(ps.primesum(12)));
    }
}
