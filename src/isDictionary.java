package com.company;

import java.util.HashMap;

public class isDictionary {
    public int solve(String[] A, String B) {
        HashMap<Character,Integer>hm = new HashMap<Character,Integer>();

        for(int i = 0; i<B.length();i++){
            hm.put(B.charAt(i),i);
        }

        for(int i = A.length-1; i>=1;i--){
            if(A[i].length()>=A[i-1].length()){
                int x = hm.get(A[i].charAt(0));
                int y = hm.get(A[i-1].charAt(0));
                System.out.println("x is "+x+" and y is "+y+" for i = "+i);
                if(x>y ){
                    continue;
                }
                else if(x==y){
                    System.out.println("Coming in x==y loop");
                    int a = hm.get(A[i].charAt(1));
                    int b = hm.get(A[i-1].charAt(1));
                    if(a>b){
                        System.out.println("Coming in this loop");
                        continue;
                    }
                    else return 0;
                }else return 0;




            }
            else return 0;
        }
        return 1;

    }

    public static void main(String[] args) {
        isDictionary id = new isDictionary();
        String[] A = {"ipial", "qjqgt", "vfnue", "vjqfp", "eghva", "ufaeo", "atyqz", "chmxy", "ccvgv", "ghtow" };
        String B = "nbpfhmirzqxsjwdoveuacykltg";
        System.out.println(id.solve(A,B));
    }
}
