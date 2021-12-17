package com.company;

import java.util.Arrays;

public class consecutiveOne {
    public int solve(String A) {
        int[] right = new int[A.length()];
        int[] left = new int[A.length()];


        int count = 0;



        for(int i = 0; i< A.length(); i++){
            if(A.charAt(i)=='1'){
                count++;
            }
        }



        left[0]= A.charAt(0)-'0';

        for(int i = 1; i<A.length(); i++){
            if(A.charAt(i)=='1'){

                left[i]=1+left[i-1];

            }

            else if(A.charAt(i)=='0'){
                left[i]=0;


            }

        }
        right[A.length()-1]= A.charAt(A.length()-1)-'0';

        for(int i = A.length()-2; i>=0; i--){
            if(A.charAt(i)=='1'){

                right[i] = 1+ right[i+1];
            }

            else if(A.charAt(i)=='0'){

                right[i]=0;


            }

        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));


        int sum = 0;
        for(int i = 0; i<A.length()-1; i++){
            if(A.charAt(i)=='0' ){
                int L = 0;
                int R = 0;

                if(i>0){
                    L = left[i-1];
                }
                if(i<A.length()-1){
                    R = right[i+1];
                }
                if(L+R<count){
                    sum = Math.max(sum,L+R+1);
                }
                else{sum = Math.max(sum,L+R);}


            }
        }
        return sum;


    }

    public static void main(String[] args) {
        consecutiveOne co = new consecutiveOne();
        System.out.println(co.solve("11110"));
    }
}
