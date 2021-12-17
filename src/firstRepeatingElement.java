package com.company;

import java.util.HashMap;

public class firstRepeatingElement {
    public int solve(int[] A) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int min = A.length;

        for(int i = 0; i<A.length; i++){
            if(hm.containsKey(A[i])){
                min = Math.min(hm.get(A[i]),min);

            }
            else{
                hm.put(A[i],i);
            }
        }

        if(min!=A.length){
            return A[min];
        }else return -1;


    }

    public static void main(String[] args) {
        int[] A = {8, 15, 1, 10, 5, 19, 19, 3, 5, 6, 6, 2, 8, 2, 12, 16, 3 };
        firstRepeatingElement fre = new firstRepeatingElement();
        System.out.println(fre.solve(A));
    }
}
