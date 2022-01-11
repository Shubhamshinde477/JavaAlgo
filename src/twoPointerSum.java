public class twoPointerSum {
    public int solve(int[] A, int B) {
        int N = A.length;
        int i = 0;
        int j = N-1;
        int ans = 0;

        while(i<j){
            long sum = A[i]+ A[j];
            if(sum==B){
                System.out.println("coming in for i = "+i+" and j = "+j);
                ans++;
                i++;
                j--;
            }else if(sum<B){
                i++;
            }else{
                j--;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        twoPointerSum tps = new twoPointerSum();
        int[] A = { 1, 2, 3, 4, 5};
        int B = 5;
        System.out.println(tps.solve(A,B));
    }
}
