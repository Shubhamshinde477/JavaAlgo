package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class anagrams {
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {

        ArrayList<String> B = new ArrayList<String>();
        for(int i = 0; i<A.size();i++){
            int[] count = new int[26];

            for(int j = 0; j<A.get(i).length();j++){

                count[A.get(i).charAt(j)-'a']++;
            }
            String s = "";
            int k = 0;
            while(k<26){
                while(count[k]>0){
                    s= s+ (char)('a'+k);
                    count[k]--;
                }
                k++;
            }
            B.add(s);

        }
        System.out.println(B);



        ArrayList<ArrayList<Integer>>row = new  ArrayList<ArrayList<Integer>>();

        for(int i = 0; i<A.size();i++){
            ArrayList<Integer>col = new ArrayList<Integer>();
//            HashMap<String,ArrayList<Integer>> hm = new HashMap<String,ArrayList<Integer>>();


            for(int j= i+1; j<A.size();j++){
                if(B.get(i).equals(B.get(j))){
                    col.add(i+1);
                    col.add(j+1);
                }

            }
            if(col.size()>0){
                row.add(col);
            }

        }
        return row;
    }

    public static void main(String[] args) {
        anagrams a = new anagrams();
        List<String>A = new ArrayList(Arrays.asList("cat", "dog", "god", "tca" ));
        System.out.println(a.anagrams(A));
    }

}
