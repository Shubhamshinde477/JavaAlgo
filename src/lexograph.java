package com.company;

public class lexograph {
    public String solve(String A) {

        int diff = 26;
        int k = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        for(int i = A.length()-1; i>=0;i--){
            if(k>A.charAt(i)-'a' ){
                int temp = k;
                j = temp;

                k = A.charAt(i)-'a';
            }
            else if(j>A.charAt(i)-'a' && j!=k){
                j = A.charAt(i)-'a';
            }
        }
        System.out.println((char)(k+'a'));
        System.out.println((char)(j+'a'));

        String s = "";
        s = (char)(k+'a')+s;
        s = s+ (char)(j+'a');

        return s;
    }

    public static void main(String[] args) {
        lexograph lp = new lexograph();
        String A = "epujxwjiad";
        String B = "scsecugqsb";
        System.out.println(lp.solve(A));  ;
    }
}
