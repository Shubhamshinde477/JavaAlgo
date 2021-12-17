package com.company;

public class findBob {
    public int solve(String A) {
        int count = 0;
        int i = 0;
        while(i<A.length()){

            int x = isPresent(A,i);

            if(x>i){
                System.out.println(x);
                count++;
                i = x;
            }
            else{i++;}
        }
        return count;

    }

    public static int isPresent(String A, int start){
        int j = 0;
        int original = start;
        String B = "bob";
        while(j<3 && start<A.length()){
            if(A.charAt(start)!=B.charAt(j)){
                return original;
            }else{
                start++;
                j++;
            }
        }
        return start-1;
    }

    public static void main(String[] args) {
        findBob fb = new findBob();
        String A = "rbobobbobljzjdbobbobpncbobobobadbobvlrrbobmypibobbqiycbobdcpbobybobgjqgbobuccboboybobmbob";
        System.out.println(fb.solve(A));
    }
}
