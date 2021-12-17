//package com.company;
//
//public class recursionPower {
//    public int pow(int A, int B, int C) {
//
//
//
//
//        if (A==0){
//            return 0;
//        }
//
//        if(B==0){
//            return 1;
//        }
//
//        if(B==1){
//            if(A<0){
//                return (A+C)%C;
//            }
//            else return A%C;
//        }
//
//
//
//        long ans = pow(A,B/2,C);
//        System.out.println(ans);
//        if((B%2)==0){
//           return  (((ans%C)*(ans%C))%C);
//
//        }else{
//            return  (((ans%C)*(ans%C)*(A%C))%C);
//                 }
//
//    }
//
//    public static void main(String[] args) {
//        int A = 71045970;
//        int B = 41535484;
//        int C = 64735492;
//
//        recursionPower rp = new recursionPower();
//        System.out.println(rp.pow(A,B,C)); ;
//    }
//}
