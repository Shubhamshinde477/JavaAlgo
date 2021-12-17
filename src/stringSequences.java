package com.company;

import java.util.HashSet;

public class stringSequences {
    public int solve(String A, String B) {
        HashSet<String> hs = new HashSet<String>();
        int N = A.length();
        int count = 0;

        if(A.length()==1){
            for(int i = 0; i<B.length();i++){
                if(B.charAt(i)==A.charAt(0)){
                    count++;
                }
            }
            return count;
        }

        for(int i = 0; i<(1<<N); i++){
            String s = "";
            for(int j = 0; j< N; j++){
                if(((i>>j)&1)==1){
                    s = s + A.charAt(j);
                }
            }
            System.out.println(s);
            if(s.length()==N){
                hs.add(s);
            }
        }
        System.out.println(hs);

        for(String ans:hs){
            if(find(B,ans)){
                count++;
            }
        }
        return count;


    }

    public boolean find(String C, String D ){
        int j = 0;
        int k = 0;
        while(j<C.length() && k<C.length()){
            if(C.charAt(j)==D.charAt(k)){
                j++;
                k++;
                if(k>=D.length()){
                    return true;
                }
            }
            else{
                j++;
                k=0;

            }
        }
        return false;

    }

    public static void main(String[] args) {
        stringSequences ss = new stringSequences();
        String A = "ebbp";
        String B = "qaoedpcebeaqocbacoccqoebpqdoqcpbdbqcecdoqcpebqpebbabqdpepcpbqbepbabocpc";
        System.out.println(ss.solve(A,B));;
    }
}
