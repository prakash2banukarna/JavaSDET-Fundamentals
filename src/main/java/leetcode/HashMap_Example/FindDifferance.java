package leetcode.HashMap_Example;

import java.util.HashMap;
import java.util.Map;
// Prakash solved it
// https://leetcode.com/problems/find-the-difference/description/
public class FindDifferance {
    public char findTheDifference(String s, String t) {
//s = "abcd", t = "abcde"

        // Create two HashMaps to store frequency count of each character in 's' and 't'
        Map<String, Integer> sMapping= new HashMap<>();
        Map<String, Integer> tMapping= new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            String sString= String.valueOf(sChar);
            int count =sMapping.getOrDefault(sString,0);
            sMapping.put(sString,count+1);
        }

        for(int j=0;j<t.length();j++){
            char tChar=t.charAt(j);
            String tString= String.valueOf(tChar);
            int count =tMapping.getOrDefault(tString,0);
            tMapping.put(tString,count+1);
        }

        System.out.println(sMapping);
        System.out.println(tMapping);

        // Compare both frequency maps to detect the extra character in 't'
        for(Map.Entry<String, Integer> keyValueInT: tMapping.entrySet()){
            String keyInT=keyValueInT.getKey(); //This gives the key in tMapping
            /*
            sMapping.get(keyInT) --> This basically fethes the value based on the key passed
            sMapping.get(keyInT)==null --> This gives if the key is not present
            sMapping.get(keyInT) != tMapping.get(keyInT) -- if value doesnt match
             */
            if(sMapping.get(keyInT)==null || sMapping.get(keyInT) != tMapping.get(keyInT)){
                System.out.println(keyInT.charAt(0));
                return keyInT.charAt(0);
            }
        }

        return 'c';

    }

    public static void main(String[] arg){
        String s = "abcdev";
        String t = "abcdevv";
        FindDifferance obj =new FindDifferance();
        obj.findTheDifference(s,t);

    }
}
