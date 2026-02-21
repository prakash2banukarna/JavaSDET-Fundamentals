package leetcode;

import java.util.*;
// Prakash solved it - But Time Limit Exceeded

// https://leetcode.com/problems/distribute-candies/description/?envType=problem-list-v2&envId=array
public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        Set objSet =new HashSet();
        for(int c:candyType){
            objSet.add(c);
        }

        int output = objSet.size() < candyType.length/2 ? objSet.size() :candyType.length/2 ; // Ternary operation
        System.out.println(output);
        return output;
    }


    public int distributeCandies_TimeExceeded(int[] candyType) {
        List<Integer> lst=new ArrayList<>();
        for(int c:candyType){
            if(!lst.contains(c)){
                lst.add(c); // storing all the unique values into lst
            }
        }
        int output = lst.size() < candyType.length/2 ? lst.size() :candyType.length/2 ;
        System.out.println(output);
        return output;
    }

    public static void main(String[] arg){
        int[] candyType = {1,1,2,2,3,3};
        DistributeCandies obj=new DistributeCandies();
        obj.distributeCandies(candyType);
    }
}
