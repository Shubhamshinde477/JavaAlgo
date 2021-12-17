package com.company;

public class reverseString {
    public String solve(String A) {
        char[] B = A.toCharArray();

        int N;
        if(B[A.length()-1]==' '){
            N = A.length()-1;

        }
        else N = A.length();

        B = reverse(B,0,N-1);

        int P1 = 0;
        int P2 = 0;
        while(P2<N){
            while(P2<N && B[P2]!=' '){
                P2++;

            }

            B = reverse(B,P1,P2-1);

            P1 = P2+1;
            P2= P1;

        }
        return String.valueOf(B);



    }
    public static char[] reverse(char[] A , int start, int end){
        while(start<end){
            A[start]= (char)(A[start]^A[end]);
            A[end]= (char)(A[start]^A[end]);
            A[start]= (char)(A[start]^A[end]);
            start++;
            end--;
        }
        return A;
    }

    public static void main(String[] args) {
        reverseString rs = new reverseString();
        String A = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
        System.out.println(rs.solve(A));

        ;
    }
}
