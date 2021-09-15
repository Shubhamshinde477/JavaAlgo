public class numberPalindrome {

    public static boolean numberPalindrome(int numb){
        int rev = 0;
        int r = 0;
        int input = numb;
        while(numb>0){
            r = numb%10;
            rev = rev *10 +r;
            numb = numb/10;

        }
        System.out.println(rev);
       return rev == input;
    }

    public static void main(String[] args) {
        if(numberPalindrome(1001)){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}
