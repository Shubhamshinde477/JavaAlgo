public class computeNCRP {
    public int solve(int A, int B, int C) {
        int n = factor(A,C);
        int r = factor(B,C);
        int nR = factor(A-B,C);


        r = pow(r,C-2,C);
        nR = pow(nR,C-2,C);
        return (n%C*r%C*nR%C)%C;

    }

    public int factor(int A, int B){

        int fact = 1;
        for(int i = 1; i<=A; i++){
            fact = (fact*i%B)%B;
        }
        return fact;
    }

    public int pow(int A, int B, int C) {

        int term = 1;
        for(int i = 1; i<=B; i++){
            term = (term*A%C)%C;

        }
        return term;
    }

    public static void main(String[] args) {
        computeNCRP cn = new computeNCRP();
        System.out.println(cn.solve(77817,14427,4198079));
//        System.out.println(cn.factor(4,5));
    }
}
