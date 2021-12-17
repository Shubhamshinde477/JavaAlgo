package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class minimumSwaps {
    public int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        int N = A.size();
        int i = 0;
        int j ;
        while(i<N){
            if(A.get(i)>B){
                j = i+1;
                while(j<N){

                    if(A.get(j)<B){

                        i++;
                        count++;
                        break;
                    }
                    else{
                        j++;
                    }
                }

            }
            else{
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        minimumSwaps ms = new minimumSwaps();
        ArrayList<Integer>A = new ArrayList<>(Arrays.asList(52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84, 27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29, 7, 22, 27, 74, 78, 38, 11, 65, 29, 52, 36, 21, 94, 46, 52, 47, 87, 33, 87, 70));
        System.out.println(ms.solve(A,19));
    }
}
