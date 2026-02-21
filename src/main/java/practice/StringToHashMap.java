package practice;

import java.util.HashMap;
import java.util.Map;

public class StringToHashMap {
    public static void main(String[] arg){
        String s = "abccccdd";
        Map<String,Integer> myHashMap= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!myHashMap.containsKey(String.valueOf(s.charAt(i)))){ //if key doesn't contain, then add the key in hash map
                myHashMap.put(String.valueOf(s.charAt(i)),1);
            }
            else{
//                myHashMap.get(String.valueOf(s.charAt(i)) + 1 );
                int newValue = myHashMap.get(String.valueOf(s.charAt(i))) + 1; // increment the value if already present
                myHashMap.put(String.valueOf(s.charAt(i)),newValue);
            }
        }
        System.out.println(myHashMap);
    }
}
