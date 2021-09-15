//import java.util.*;
//
//public class simpleWordCount {
//    public static void main(String[] args) {
//        String Sentence = "a group of words containing a subject and a verb, "+
//                "that expresses a statement, a question, etc. When a sentence is written "+
//                "it begins with a big (capital) letter and ends with a full stop.";
//
//        String[] words = Sentence.split(" ");
//        HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
//
//        List<String> stringOfWords = Arrays.asList(words);
//        stringOfWords.sort('A');
//
////        stringOfWords.forEach((value)->System.out.print(value+"\t"));
//
//        HashSet<String>newSet = new HashSet<String>();
//
//
//
//        stringOfWords.forEach((value)->newSet.add(value));
//        newSet.
//
//        for(int i =0; i< words.length; i++){
//            if(wordCount.containsKey(words[i])){
//                wordCount.put(words[i], wordCount.get(words[i])+1);
//            }else{
//                wordCount.put(words[i],1);
//            }
//
//
//        }
//        wordCount.forEach((key,value)-> System.out.println(key+" : "+value));
//    }
//}
