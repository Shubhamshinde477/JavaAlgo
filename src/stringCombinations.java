package com.company;

public class stringCombinations {
    public int solve(String A) {
        int N = A.length();
        int count = 0;
        int j = 0;

        while(j<N){
            if(A.charAt(j)=='A' || A.charAt(j)=='E' || A.charAt(j)=='I' || A.charAt(j)=='O' || A.charAt(j)=='U'){

                count+= (N-j);
                j++;

            }else{
                j++;
            }
        }
return count;

    }

    public static void main(String[] args) {
        stringCombinations sc = new stringCombinations();
        System.out.println(sc.solve("ABEC"));;
    }
}
