package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class countOrSum {
    public int solve(ArrayList<Integer> A) {
        long ans = 0;
        int C = (int) Math.pow(10,9)+7;
        int N = A.size();
        for(int i = 0; i<30; i++){
            ArrayList<Integer> bit = new ArrayList<Integer>();
            for(int j =0; j<N; j++){
                if( ((A.get(j)>>i)&1)==1 ){
                    bit.add(1);
                }else{
                    bit.add(0);
                }

            }
            int count = countOr(bit);

            ans = (ans+(count*(1<<i)));
            System.out.println(ans);
        }
        return (int)(ans);


    }
    public int countOr(ArrayList<Integer> A){
        int i = 0;
        int sum = 0;
        int count = 0;
        int N = A.size();


        while(i<N){
          if(A.get(i)==0){
                count++;
                i++;
            }else if(A.get(i)==1){
                sum = (((count)*(count+1))/2) + sum;
                count=0;
                i++;
            }


        }
        if(count>0){
            sum = (((count)*(count+1))/2) + sum;
        }

        return (N*(N+1))/2 -sum;






    }

    public static void main(String[] args) {
        countOrSum co = new countOrSum();
        ArrayList<Integer>A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(co.solve(A));
    }
}
