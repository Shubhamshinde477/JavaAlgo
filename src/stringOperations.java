package com.company;

public class stringOperations {
    public String solve(String A) {


        String D = "";int count = 0;
        for(int j = 0; j<=A.length()-1; j++){
            if((A.charAt(j)&(1<<5))!=0){
                D = D+A.substring(j,j+1);
                System.out.println(D);
            }
            int N = D.length()-1;
            if(N>=0){
            if(D.charAt(N)=='a' || D.charAt(N)=='e'||D.charAt(N)=='i'||D.charAt(N)=='o'||D.charAt(N)=='u')
            {
                D=D.substring(0,N)+'#';
            }
            }
        }


        return D+D;
    }

    public static void main(String[] args) {
     stringOperations so = new stringOperations();
     String A = "GrNvsMcsyQEiEfzikav";
        System.out.println(so.solve(A));
    }
}
