public class rotateArraySearch {
    public int search(final int[] A, int B) {
        int N = A.length;
        if(N==1) return A[0];
        int point = -1;
        int ans = -1;

        int l = 0;
        int r = N-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(A[mid]>=A[0]){
                l = mid+1;
            }else{
                point = mid;

                r = mid-1;
            }
        }

        if(A[0]<B){
            ans = binarySearch(A,0,point-1,B);
        }else{
            ans = binarySearch(A,point,N-1,B);
        }
        return ans;

    }

    public int binarySearch(int[] A, int l, int r,int target){

        while(l<=r){
            int mid = (r+l)/2;
            if(A[mid]==target){
                return mid;
            }else if(A[mid]>target){
                r = mid-1;

            }else{
                l = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        rotateArraySearch ra = new rotateArraySearch();
        int[] A = { 180, 181, 182, 183, 184, 187, 188, 189, 191, 192, 193, 194, 195, 196, 201, 202, 203, 204, 3, 4, 5, 6, 7, 8, 9, 10, 14, 16, 17, 18, 19, 23, 26, 27, 28, 29, 32, 33, 36, 37, 38, 39, 41, 42, 43, 45, 48, 51, 52, 53, 54, 56, 62, 63, 64, 67, 69, 72, 73, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 96, 98, 99, 101, 102, 104, 105, 106, 107, 108, 109, 111, 113, 115, 116, 118, 119, 120, 122, 123, 124, 126, 127, 129, 130, 135, 137, 138, 139, 143, 144, 145, 147, 149, 152, 155, 156, 160, 162, 163, 164, 166, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177};
        int B = 42;
        System.out.println(ra.search(A,B));
    }

}
