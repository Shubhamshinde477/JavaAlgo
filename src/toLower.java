package com.company;

import java.util.Arrays;

public class toLower {
    public char[] to_lower(char[] A) {

        for(int i = 0;i<A.length; i++){

            if(((A[i]>>5)&1)==0){
                A[i]^=(1<<5);


            }
            else continue;
        }
        return A;
    }

    public static void main(String[] args) {
        toLower tl = new toLower();
        char[] A = {'S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y' };
        System.out.println(Arrays.toString(tl.to_lower(A)));
        ;
    }
}
