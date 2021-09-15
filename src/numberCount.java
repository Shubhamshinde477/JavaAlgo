import java.util.*;
import java.util.stream.Collectors;

public class numberCount {
    public static void main(String[] args) {

        int[] numbs = {1,2,1,2,1,2,1,4,5,2,6,8,5,6,4,1,2,3,6,4,1,2,3,6,4,1,2,3,6,12,1};
        HashMap<Integer,Integer> numbCount = new HashMap<Integer,Integer>();

        for(int i = 0; i<numbs.length; i++){
            if(numbCount.containsKey(numbs[i])){
                numbCount.put(numbs[i], numbCount.get(numbs[i])+1);
            }else{
                numbCount.put(numbs[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : numbCount.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        ArrayList<Integer>newList = new ArrayList<>();

        for(int in: numbs){
            newList.add(in);
        }

        for(int num: newList){
            System.out.println(num);

        }



    }
}
