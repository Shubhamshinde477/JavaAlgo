public class countSetBits {
    public int solve(int A) {
        int B = (int) (Math.pow(10,9)+7);
        int count = 0;
       for(int i = 1; i<=A; i++){

            int k = i;

            while(k>0){
                if((k&1)==1){

                    count = (count+1)%B;

                }
                k = k>>1;

            }

        }

        return count;
    }

    public static void main(String[] args) {
        countSetBits cs = new countSetBits();
        System.out.println(cs.solve(100000000));
    }
}
