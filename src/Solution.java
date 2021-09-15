
    public class Solution {
        public static String solve(String A) {
           String ne = "" ;
           for(int i = 0; i< A.length(); i++){
                if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)== 'o' || A.charAt(i)=='u'){
                  ne = ne + A.charAt(i);
                }
            }
            return ne;
        }

        public static void main(String[] args) {
            System.out.println(solve("acvbde"));
        }
    }

