public class computeCombination {
    public int solve(int A, int B, int C) {

        if(A==B){
            System.out.println("coming in loop for A = "+A);
            return A%C;
        }
        if(A==1 ){
            return 1;
        }

        return (solve(A-1,B,C)%C+solve(A-1,B-1,C)%C)%C;

    }

    public static void main(String[] args) {
        computeCombination cc = new computeCombination();
        System.out.println(cc.solve(6,2,13));
    }
}
