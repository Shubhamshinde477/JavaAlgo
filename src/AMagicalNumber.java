public class AMagicalNumber {
    public int solve(int A, int B, int C) {
        int mod = 7 + (int) (Math.pow(10,9));

        long l = Math.min(B,C);
        long r = ((Math.min(B,C))*A)%mod;

        long ans = 0;
        long lcm = ((C*B)/gcd(C,B)) % mod;
        while(l<=r){
            long mid = (l + (r-l)/2)%mod;
            long x = (((mid)/C) + ((mid)/B) - ((mid)/lcm));
            if(x==A){
                ans = mid;
                r = (mid -1);
                System.out.println("coming in for ans = "+ans);

            }
            else if(x<A){
                l = (mid +1);
                System.out.println("coming in for l = "+l);

            }else{
                r = mid-1;
                System.out.println("coming in for r = "+r);

            }
        }
        return (int)ans%mod;
    }

    public int gcd(int A, int B){
        if(A>B){
            int temp = A;
            A = B;
            B = temp;
        }while(A>0){
            int temp = A;
            A = B%A;
            B = temp;
        }
        return B;
    }

    public static void main(String[] args) {
        AMagicalNumber amn = new AMagicalNumber();
        System.out.println(amn.solve(807414236,3788,38141));
    }
}
