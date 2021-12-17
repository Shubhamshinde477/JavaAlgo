package com.company;

public class longestPalindrome {
    public String longestPalindrome(String A) {
        if(A==null || A.length()<0){
            return "";
        }
        int start = 0;
        int end = 0;
        for(int i = 0; i<A.length();i++){
            int len1 = palindrome(A,i,i);
            int len2 = palindrome(A,i,i+1);
            int len = Math.max(len1,len2);

            if(len > end-start+1){
                start = i-(len-1)/2;
                end = i+(len)/2;
            }
            System.out.println(A.substring(start,end+1)+" at index i we are getting this " +i);
        }
        return A.substring(start,end+1);
    }

    public int palindrome(String A, int left, int right){
        int L = left;
        int R = right;
        while((L>=0 && R<A.length()) && (A.charAt(L)==A.charAt(R))){
            L--;
            R++;
        }
        return R-L-1;
    }



    public static void main(String[] args) {
        longestPalindrome lp = new longestPalindrome();
        String A = "abbcccbbbcaaccbababcbcabca";
        System.out.println(lp.longestPalindrome(A));
    }
}
