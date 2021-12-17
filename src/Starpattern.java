package com.company;

public class Starpattern {

    public static void printPattern(int N){
        for(int i = N; i>0; i--){
            for(int j = i; j<N; j++ ){
                System.out.print(" ");
            }

            for(int k = 0;k<(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();


        }
    }

    public static void main(String[] args) {
        printPattern(8);
    }
}
