package com.company;

public class divisibiltyByEight {
    public int solve(String A) {


        String num = "";

        for(int i = A.length()-1; i>A.length()-4; i--){
            System.out.println(A.charAt(i));
            num = A.charAt(i) + num;
        }
//        System.out.println(num);
        int numb = Integer.valueOf(num);
        if(numb %8==0){
            return 1;
        }
        return 0;

    }

    public static void main(String[] args) {
        divisibiltyByEight ds = new divisibiltyByEight();
        System.out.println(ds.solve("14521456254800"));
    }

}
