import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class wordsCount {
    public static void main(String args[]){
        String Sentence = "a group of words containing a subject and a verb, "+
                "that expresses a statement, a question, etc. When a sentence is written "+
                "it begins with a big (capital) letter and ends with a full stop.";

        String[] words = Sentence.split(" ");
        HashMap<String,Integer>wordCount = new HashMap<String,Integer>();

        for(int i =0; i<words.length; i++){
           String key = words[i];
           int numb = wordCount.getOrDefault(key,0);
           wordCount.put(key,++numb);
        }

        for(Map.Entry<String,Integer> eniu: wordCount.entrySet()){
            System.out.println("Word = "+eniu.getKey()+ " and count is "+eniu.getValue());

        }

    }
}
