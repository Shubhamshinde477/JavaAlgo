package com.company;

public class evenOddIndex {
    public int solve(int[] A) {


        int N = A.length;




        int count = 0;
        int even ;
        int odd;

        for(int i = 0; i<N; i++){
            int evenSum = 0;
            int oddSum = 0;

            for(int j=0;j<i; j++){
                if(j%2==0){
                    evenSum = evenSum+ A[j];
                }else{
                    oddSum =  oddSum + A[j];
                }
            }

            for(int k = i+1; k<N ; k++){
                if((k-1)%2==0){
                    evenSum = evenSum+ A[k];
                }else{
                    oddSum =  oddSum + A[k];
                }
            }

            if(evenSum==oddSum){
                count++;
            }
        }
        return count;


    }

    public static void main(String[] args) {
        evenOddIndex eo = new evenOddIndex();
        int[] A = { 1, 2, 3, 7, 1, 2, 3};
        System.out.println(eo.solve(A));
    }

        }
