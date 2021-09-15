import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class interview {





//    output = o1c3u1r2e2n1

    public static <Hashset> void main(String[] args) {
        String val="occurrence";

        char[] chars = val.toCharArray();
        int[] counter = new int[26];
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();

        Arrays.fill(counter,0);
        HashSet<Character>charc = new HashSet<>();

        for(int k = 0; k<chars.length;k++){
            counter['a' + k]++;
            
        }







//        int j = chars.length-1;
//        while(j>0){
//            System.out.println(chars[j]);
//            j--;
//        }

        for(int i =0; i<chars.length;i++){
            if(count.containsKey(chars[i])){

                count.put(chars[i],count.get(chars[i])+1);

                System.out.println(chars[i]);
            }
            else{
                count.put(chars[i],1);
            }
        }
        count.forEach((key,value)->System.out.print(key+""+value));
    }
}
