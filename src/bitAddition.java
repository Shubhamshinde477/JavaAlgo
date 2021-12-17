package com.company;

public class bitAddition {
    public static String addBinary(String A, String B) {

        int diff = A.length()- B .length();

        int carry = 0;
        int sum = 0;

        int C = 0;
        int D = 0;

        String digit = "";
        if(diff>0){
            while(diff>0){
                B = '0' + B;
                diff--;
            }
        }else if( diff<0){
            while(Math.abs(diff)!=0){
                A = '0' + A;
                diff = (Math.abs(diff))-1;
            }
        }
        else{
            A = '0'+ A;
            B = '0' + B;
        }
        for(int i = A.length()-1; i>=0; i--){
            C = (int) A.charAt(i);
            D = (int) B.charAt(i);
            carry = carry/2 ;
            sum = carry+C+D-'0'-'0';

            digit = (char) sum%2 + digit;

            carry = sum;


        }
        if(carry/2 ==1){
            digit = carry/2 + digit;
        }
        return digit;

    }

    public static void main(String[] args) {
        System.out.println(addBinary("100100","11001"));
    }
}
