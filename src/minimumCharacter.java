package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class minimumCharacter {
    public int solve(String A, int B) {
        int[] Count = new int[26];
        int c = 0;
        if(B==0){
            HashSet<Character> hs = new HashSet<Character>();

            for(int j = 0; j< A.length(); j++){
                hs.add(A.charAt(j));
            }
            return hs.size();
        }

        for(int i = 0; i<A.length(); i++){
            Count[A.charAt(i)-'a']++;
        }

        for(int i = 0; i<A.length(); i++){
            if(B>=Count[A.charAt(i)-'a'] && Count[A.charAt(i)-'a']==1 ){
                B = B-Count[A.charAt(i)-'a'];
                Count[A.charAt(i)-'a'] = 0;
            }
        }
        System.out.println(B);
        System.out.println(Arrays.toString(Count));

        for(int i = 0; i<26; i++){
            if(Count[i]>0){
                c++;
            }
        }
        return c;

    }

    public static void main(String[] args) {
        minimumCharacter mc = new minimumCharacter();
        String A = "wfnfozvsrt";
        int B = 4;
        System.out.println(mc.solve(A,B));
    }
}
