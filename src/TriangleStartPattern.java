public class TriangleStartPattern {

    public static void main(String[] args) {

        int N = 6;
            int i ;
        for(i =1; i<N; i++){
            for(int j= 0; j<i; j++ ){
                System.out.print("*");
            }
            System.out.println("");

        }
        for(int k = i; k>0; k--){
            for(int l = k; l>0; l--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
