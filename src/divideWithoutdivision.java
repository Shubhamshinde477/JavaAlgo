public class divideWithoutdivision {
    public int divide(int A, int B) {
        long m = A;
        long n = B;
        if(A<0)
            m=m*-1;
        if(B<0)
            n=n*-1;
        //  System.out.println(m);
        // System.out.println(n);
        // if(m>Integer.MAX_VALUE){
        //     return Integer.MAX_VALUE;
        // }


        // long power = (long) (Math.log(m)/Math.log(n));
        long ans = 0;
        long count = 0;
        for(long i = 31; i>=0; i--){
            if(m>=0){
                // System.out.println('h');
                long ok=m;
                m = m-(long)(n<<i);
                if(m>=0){
                    ans = (long)ans|(long)(1l<<i);
                }else{
                    m=ok;
                }
            }
        }
        //   System.out.println((long)ans);
        if(A<0)
            ans=-ans;
        if(B<0)
            ans=-ans;

        if(ans> Integer.MAX_VALUE){
            // System.out.println('h');
            return Integer.MAX_VALUE;
        }else return (int) ans;

    }
    public static void main(String[] args) {
        divideWithoutdivision dd = new divideWithoutdivision();
        System.out.println(dd.divide(-2147483648,-1));
    }
}
