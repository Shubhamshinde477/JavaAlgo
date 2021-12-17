package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class largeContinousSumZero {
    public int[] lszero(int[] A) {
        int N = A.length;
        int[] pref = new int[N];

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        hm.put(0,-1);
        int sum = 0;
        for(int i = 0; i<N;i++){
            sum= sum+A[i];
            pref[i]=sum;
        }

        int ans = 0;
        int start = 0;
        int end = 0;
        for(int j = 0; j<N; j++){
            if(hm.containsKey(pref[j])){
                int diff = j-hm.get(pref[j]);
                System.out.println(diff);
                if(ans<diff){
                    ans = diff;
                    end = j;
                    start = hm.get(pref[j]);

                }

            }
            else{
                hm.put(pref[j],1);
            }


        }
        int[] B = new int[end-start+1];


        int k = 0;
        while(start<=end){
            B[k] =A[start];
            start++;
            k++;
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = {1,2,-2,4,-4};
        largeContinousSumZero ls = new largeContinousSumZero();
        System.out.println(Arrays.toString(ls.lszero(A)));
    }
}
