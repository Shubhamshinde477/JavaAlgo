public class greaterRemainder {
    public int solve(int[] A) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i<A.length; i++){
            if(A[i]>first){
                second = first;
                first = A[i];


            }else if(A[i]>second && A[i] != first ){
                second = A[i];
            }

        }


        return second%first;
    }

    public static void main(String[] args) {
        greaterRemainder gr = new greaterRemainder();
        int[] A = {927, 707, 374, 394, 279, 799, 878, 937, 431, 112};
        int[] B = {1, 2, 3, 3};
        System.out.println(gr.solve(B));
    }
}
