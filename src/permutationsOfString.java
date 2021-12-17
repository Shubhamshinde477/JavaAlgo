package com.company;

public class permutationsOfString {
    public int solve(String A, String B) {
        int[] count = new int[26];
        int k = A.length();
        int N = B.length();

        for(int i = 0; i<k; i++){
            count[A.charAt(i)-'a']++;
        }
        boolean flag = false;
        int counter = 0;
        for(int i = 0; i< N-k;i++){
            int j = k+i;
            String s = B.substring(i,j);
            int n = 0;
            System.out.println(s);

            while(n<s.length()){
                if(count[s.charAt(n)-'a']>0){
                    flag = true;
                    n++;

                }
                else
                {
                    flag = false;
                    break;
                }


            }
            if(flag){
                counter++;
            }


        }
        return counter;
    }

    public static void main(String[] args) {
        permutationsOfString ps = new permutationsOfString();
        String A = "abc";
        String B = "abcbacabc";

        System.out.println(ps.solve(A,B));
    }
}
