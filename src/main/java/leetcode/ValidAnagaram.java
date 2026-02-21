package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
//Prakash solved it
//https://leetcode.com/problems/valid-anagram/description/?envType=problem-list-v2&envId=sorting
public class ValidAnagaram {

    /*
    Convert string to String[]
    Using stream, create a map of {string :count}
    For each entry key in map1 ,check if the key is presnet in map2,
    If present, then check the values are same
     */
    public boolean isAnagram_Solution2(String s, String t) {
        String[] str1= s.split("");
        String[] str2= t.split("");
        Map<String,Long> myMapStr1=Arrays.stream(str1)
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));

        Map<String,Long> myMapStr2=Arrays.stream(str2)
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));

        //checking if the keys are matching
        if(myMapStr1.keySet().size()!=myMapStr2.keySet().size()){
            return false;
        }

        for(Map.Entry<String,Long> str1Map:myMapStr1.entrySet()){
            String st1Key=str1Map.getKey();
            myMapStr2.get(st1Key);
            if(myMapStr2.get(st1Key)==null){ //str1 key not found in str2
                return false;
            }
            else{
                if(str1Map.getValue()!=myMapStr2.get(st1Key)){
                    return false;
                }
            }
        }
        System.out.println(true);
        return true;
    }

    public boolean isAnagram(String s, String t) {
        //s = "anagram", t = "nagaram"

        String[] str1= s.split("");// Step 1: Converting string to array
        String[] str2=t.split("");
        Arrays.sort(str1); //Step 2 : Sorting the array
        Arrays.sort(str2);

        boolean myoutput = Arrays.equals(str1,str2); //Step 3: comparing the array
        System.out.println(myoutput);
        return myoutput;
    }

    public static void main(String[] arg){
//        String s = "anagram";
//        String t = "nagaram";
        String s = "a";
        String t = "ab";
        ValidAnagaram obj=new ValidAnagaram();
//        obj.isAnagram(s,t);
        obj.isAnagram_Solution2(s,t);

    }
}
