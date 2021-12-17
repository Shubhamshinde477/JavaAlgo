package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class subarrySum {
    public int[] solve(int[] A, int B) {
        long[] prefix = new long[A.length+1];

        HashMap<Long,Integer> hm = new HashMap<>();

        prefix[0] =  0;
        hm.put(0L, 0);

        for(int i = 1; i<A.length+1; i++){
            prefix[i] = prefix[i-1]+A[i-1];
            hm.put(prefix[i],i);

        }


        // if(prefix[0]==sum){
        //     int[] D = new int[1];
        //     D[0]= A[i];
        //     return D;
        // }
        int start = -1;
        int end = -1;
        //int diff = A.length;
        for(int i = 0; i<A.length+1; i++){
            long a = prefix[i] - B;

            if(hm.containsKey(a)){
                start = hm.get(a);
                end = i;

                break;

            }

        }
        if(start == -1){
            int[] C = {-1};
            return C;
        }
        int[] C = new int[end-start];
        int k = start;
        for(int i = 0; i<end-start; i++){
            C[i] = A[k];
            k++;

        }
        return C;
    }
    public static void main(String[] args) {
        subarrySum ss = new subarrySum();
        int[] A = {1,2,3,4,5 };
        int B = 5;
        System.out.println(Arrays.toString(ss.solve(A,B))); ;
    }
}
