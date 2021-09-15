public class mobilePhone {

        public static int[] solve(int[] A, int[] B) {

            int[] count = new int[B.length];
            int sum =0;
            int counter =0;



            for(int i = B.length-1;i>=0;i-- ){


                int len = A.length-1;

                if(B[i]<A[0]){
                    count[i]=0;
                  break;
                }else {
                    while (B[i] > sum && len>=0 && counter<A.length) {
                        sum = sum + A[len];

                        len--;
                        counter++;

                    }
                }
                count[i] = counter;
                sum = 0;
            }

        return count;
        }

    public static void main(String[] args) {
           int[] A = { 23, 36, 58, 59 };
           int[] B = {3, 207, 62, 654, 939, 680, 760};
            int[] ans = solve(A,B);
           for(int k =0; k<ans.length;k++){
               System.out.println(ans[k]);
           }

    }


}
