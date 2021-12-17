package com.company;

public class Main {

    public static void main(String[] args) {
	Name(10);



    }
    public static void Name(int N){
        if(N==0){
            return;

        }else{
            System.out.println("Shubham");
             N--;
            Name(N);
        }
    }

}
