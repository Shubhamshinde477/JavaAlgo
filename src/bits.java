package com.company;

public class bits {
    public int numSetBits(int A) {
        int count = 0;

        while(A>1){
            if(A%2!=0){
                count++;
                A = A/2;
            }
            else A = A/2;
        }

        return count+A;
    }

    public static void main(String[] args) {

        bits Bit = new bits();
        System.out.println(Bit.numSetBits(15));
    }
}
