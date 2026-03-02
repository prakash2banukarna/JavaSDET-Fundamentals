package leetcode;

import java.util.HashMap;
import java.util.Map;
// Prakash solved it
// https://leetcode.com/problems/count-common-words-with-one-occurrence/description/
public class CountCommonWordsOneOccu {
    public int countWords(String[] words1, String[] words2) {
//words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]

        Map<String,Integer> words1Count=new HashMap<>();
        Map<String,Integer> words2Count=new HashMap<>();

        //Step1 : find words 1 count
        for(int i=0;i<words1.length;i++){
            int count=words1Count.getOrDefault(words1[i],0);
            words1Count.put(words1[i],count+1);
        }

        //Step2 : find words 2 count
        for(int i=0;i<words2.length;i++){
            int count=words2Count.getOrDefault(words2[i],0);
            words2Count.put(words2[i],count+1);
        }

        int count=0;
        for(Map.Entry<String,Integer> keyValue:words1Count.entrySet()){
            if(keyValue.getValue()==1){ // Step 3: if the words 1 count is equal to 1
                String oneOccuranceInWord1 = keyValue.getKey(); // fetching the respective key(string) to check how many times this has occurred in word 2
                int oneOccuranceInWord1CountInWord2=words2Count.getOrDefault(oneOccuranceInWord1,0); // fetching the count in o=word 2
                if(oneOccuranceInWord1CountInWord2==1){
                    count++;
                }
            }
        }

        System.out.println(count);
        return count;



    }

    public static void main(String[] arg){
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};
        CountCommonWordsOneOccu obj=new CountCommonWordsOneOccu();
        obj.countWords(words1,words2);
    }
}
