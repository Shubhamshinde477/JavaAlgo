package com.company;

public class Fizzbuzz {

        public static String[] fizzBuzz(int A) {

            String[] arr = new String[A-1];

            for(int i =1; i<A; i++){
                if(i%3==0 && i+1%5==0){
                    arr[i-1]="FizzBuzz";
                }
                else if(i+1%3==0){
                    arr[i-1]= "Fizz";
                }
                else if(i+1%5==0){
                    arr[i-1]= "Buzz";
                }
                else{
                    arr[i-1] = String.valueOf(i);
                }

            }
            return arr;
        }


    public static void main(String[] args) {
        for(String a: fizzBuzz(5)){
            System.out.print(a);
        };
    }

}
