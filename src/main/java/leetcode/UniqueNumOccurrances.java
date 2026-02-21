package leetcode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//Prakash solved it
// https://leetcode.com/problems/unique-number-of-occurrences/description/

/*
Step 1: Use a HashMap to count how many times each integer appears in the input (where the key is the integer, and the value is its count).
Step 2: Create a List and add each unique count value from the HashMap
Step 3: Compare the size of the HashMap  with the size of the List
 */
public class UniqueNumOccurrances {
    public boolean uniqueOccurrences(int[] arr) {
//int[] arr = {1,2,2,1,1,3};
        Map<Integer,Long> intCount=Arrays.stream(arr)
                .boxed().collect(
                        Collectors.groupingBy(
                                Function.identity(),Collectors.counting()
                        )
                );

//        System.out.println("Original values size :" +intCount.size());
        List<Integer> mapValues=new ArrayList<>();

        for( Map.Entry<Integer,Long> keyValue:intCount.entrySet()){
            System.out.println(keyValue.getValue());
            int x= Math.toIntExact(keyValue.getValue());
            if(!mapValues.contains(x)){
                mapValues.add(x);
            }
        }
//        System.out.println("Values after set :" +mapValues.size());

        /*
        Below step can also be written as return intCount.size()==mapValues.size();
         */
//        if(intCount.size()==mapValues.size()){
//            return true;
//        }
//        else{
//            return false;
//        }
        return intCount.size()==mapValues.size();

    }

    public static void main(String[] arg){
        int[] arr = {1,2,2,1,1,3};
        UniqueNumOccurrances obj = new UniqueNumOccurrances();
        obj.uniqueOccurrences(arr);
    }
}
