public class peakElement {
    public int solve(int[] A) {

        int N = A.length;
        if(A[0]>A[1]){
            return A[0];
        }else if(A[N-1]>A[N-2]) {
            return A[N-1];
        }
        int l = 1;
        int r = N-2;


        while(l<=r){
            int mid = (l+r)/2;;

            if(A[mid-1]<A[mid] && A[mid+1]<A[mid]){
                return A[mid];
            }
            else if(A[mid-1]>A[mid]){
                l = mid-1;
            }else{
                r = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        peakElement pe = new peakElement();
        int[] A = {5, 17, 100, 11};
        System.out.println(pe.solve(A));
    }
}
