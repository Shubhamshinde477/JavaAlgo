public class AdjacentEven {
    public static int solve(int[] A) {

        int odd = 0;
        for(int x : A)  odd += (x & 1);
        System.out.println(odd);
        return Math.min(odd, A.length - odd);
    }

    public static void main(String[] args) {
        int[] A = {17,11,12,13,14,15};
        int[] B = { 33, 82, 75, 4, 52, 74, 79, 46, 18, 73, 1, 83, 46, 94, 44, 86, 40, 1, 46, 24, 99, 16, 88, 6, 66, 17, 1 };
        System.out.println(solve(A));
    }
}
