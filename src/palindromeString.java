package com.company;

import java.util.HashMap;

public class palindromeString {

    public int solve(String A) {
        int count = 0;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i = 0; i<A.length(); i++){
            if(hm.containsKey(A.charAt(i))){
                hm.put(A.charAt(i),hm.get(A.charAt(i))+1);
            }else{
                hm.put(A.charAt(i),1);
            }
        }

        for(Character ch: hm.keySet()){


            if(hm.get(ch)%2!=0){
                count++;
            }
            if(count>1){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        String st = "mnxljrajwhxiaquajokwvoqqphylxpbanmmhfxsmssxzsdnprtgibuhaxnwxzfozexiascybplaaqjcthuydnoowmkzyamodzknkqmwdglqqnhflfslqyowcangsddhcjjuiyfbdkevlghbictrvnmnathotrekyrggwcmbzorqtyeowksywlbetsyhjvczcnvusfdrxythrhhoxtuuprqftgwohcgpngktkharijsovuknae";
        palindromeString ps = new palindromeString();
        ps.solve(st);
    }
}
