package com.company;

public class closestminAndMax {
    public int solve(int[] A) {
        int minIndex = 2*A.length;
        int maxIndex = 2*A.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans = A.length-1;
        for(int i = 0; i<A.length; i++){
            if(A[i]> max){

                max = A[i];
            }
            if(A[i]<min){

                min = A[i];
            }


        }
        System.out.println("max is "+max+ " and min is "+min);

        for(int i = A.length-1;i>=0;i--){
            if(A[i]==max){
                ans = Math.min(ans,maxIndex-i+1);
                maxIndex = i;
                System.out.println("max index ans is "+ans);
            }
            if(A[i]==min){
                ans = Math.min(ans,minIndex-i+1);
                minIndex = i;
                System.out.println("min index ans is "+ans);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        closestminAndMax cmm = new closestminAndMax();
        int[] A = {814, 761, 697, 483, 981};
        System.out.println(cmm.solve(A));
    }
}
