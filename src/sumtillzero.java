package com.company;

public class sumtillzero {

    public int solve(int A) {

    int s = getSum(A);
        System.out.println("sum after first iteration is "+s);
    while(s>9){
        s = getSum(s);
        System.out.println("sum after second iteration is "+s);
    }
    if(s==1){
        return 1;
    }else return 0;
}
  public int getSum(int N){
        if(N<10){
            return N;
        }

        return getSum(N/10)+N%10;

    }

    public static void main(String[] args) {
        sumtillzero sz = new sumtillzero();
        System.out.println(sz.solve(83557));
    }
}
