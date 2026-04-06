package leetcode;

import java.util.*;
// Prakash solved it
//https://leetcode.com/problems/uncommon-words-from-two-sentences/description/?envType=problem-list-v2&envId=hash-table

/*
Step 1: Convert string to List of Strings
Step 2: Add both strings
Step 3: Find the counts of string in HashMap
Step 4: If the count is equal to 1, then thats the output
 */
public class UncommonWordsFromTwoSentance {
    public String[] uncommonFromSentences(String s1, String s2) {
//
         // Step 1
        List<String> s1lst= List.of(s1.split(" "));
        List<String> s2lst= List.of(s2.split(" ")); //s2.split(" ") this is array, so using List.of

        // Step 2
        ArrayList<String> result = new ArrayList<>(s1lst);
        result.addAll(s2lst);

        Map<String,Integer> strCountMap=new HashMap<>();


        for(int i=0;i<result.size();i++){ // checking which S2 values not present in S1
            int count=strCountMap.getOrDefault(result.get(i),0);
            strCountMap.put(result.get(i),count+1);
        }

        List<String> outputLst=new ArrayList<>();

       for(var x:strCountMap.entrySet()){
           int count=x.getValue();
           if(count==1){
               outputLst.add(x.getKey());
           }
       }

       String[] output=new String[outputLst.size()];
       for(int i=0;i<outputLst.size();i++){
           output[i]=outputLst.get(i);
       }

       return output;

    }

    public static void main(String[] arg){
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        UncommonWordsFromTwoSentance obj= new UncommonWordsFromTwoSentance();
        obj.uncommonFromSentences(s1,s2);
    }
}
