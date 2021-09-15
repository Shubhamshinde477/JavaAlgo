public class stringReversal {
    public static void main(String[] args) {
        String sentence = "This is a demo string";

        char[] chars = sentence.toCharArray();
        String[] words = sentence.split(" ");
        int i = 0; int j = chars.length-1;
        char temp = 'a';
        while(i<j){
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }

        int k = 0; int l = words.length-1; String tempo = " ";
        while(k<l){
            tempo = words[k];
            words[k] = words[l];
            words[l] = tempo;
            k++;
            l--;
        }
        System.out.println(new String(chars));
        System.out.println(String.join(" ",words));

    }
}
