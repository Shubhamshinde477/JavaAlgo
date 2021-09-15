public class stringPalindrome {


public static boolean palindrome(String name){
    int i = 0; int j = name.length()-1;
    while(i<j){
        if(name.charAt(i)!=name.charAt(j)){
            return false;
        }else{
            i++;
            j--;
        }
    }
    return true;

}

    public static void main(String[] args) {
        if(palindrome("MOM")){
            System.out.println("String is Palindrome");

        }
        else{
            System.out.println("String is not Palindrome");
        }
    }

}
