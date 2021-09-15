public class slantStar {
    public static void main(String[] args) {
        int N= 5;
        int counter = 0;
        String basic = "";

        for(int i = 0; i<N;i++){
        basic= basic + "*";
        }

        for(int i = 0; i<N;i++){
//            for(int k = N-i;k>0;k--){
//                System.out.print(" ");
//            }
            System.out.print(basic);

            for(int j = 0; j<i;j++){
                System.out.print(" ");
            }
            System.out.print(basic);
            System.out.println("");
        }

    }

}
