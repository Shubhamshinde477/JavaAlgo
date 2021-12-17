//package com.company;
//
//import java.util.Arrays;
//
//public class ArrayLeftRotation {
//    public static int[][] solve(int[] A, int[] B) {
//
//        int[][] newArr = new int[B.length][A.length];
//
//
//        for(int i = 0; i<B.length; i++){
//
//            int j= 0;
//            int k = B[i];
//
//            int i = 0;
//            int j = A.length-1;
//
//            while(i<j){
//                A[i] = A[i]^A[j];
//                A[j] = A[i]^A[j];
//                A[i]= A[i]^A[j];
//                i++;
//                j--;
//            int temp = 0;
//            System.out.println(Arrays.toString(Arr));
//            while(j<k){
//
//                temp = Arr[j];
//                Arr[j] = Arr[k];
//                Arr[k] = temp;
//                j++;
//                k--;
//            }
//
//
////            int m = B[i];
////            int n = Arr.length-1;
////
////            while(m<n){
////                Arr[m]=Arr[m]^Arr[n];
////                Arr[m] = Arr[m]^Arr[n];
////                Arr[m] = Arr[m]^Arr[n];
////                m++;
////                n--;
////            }
//
//
//            newArr[i]= Arr;
//
//        }
//        return newArr;
//    }
//
//
//
//    public static void main(String[] args) {
//        int[] A = {1,3,4,5,6};
//        int[] B = {2,3};
//        System.out.println(solve(A,B));
//    }
//}
