package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
// Prakash solved it
// https://leetcode.com/problems/sort-the-people/description/

/*
Create a map as Key : heights ,value : index-Name
Order the height using descending order
using hashmap, get the name for hight and insert
 */
public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
//names = ["Mary","John","Emma"], heights = [180,165,170]

        Map<Integer,String> nameindHeight=new HashMap<>(); //MyMap

        //Step 1: Creating a HashMap , Key : heights ,value : index-Name
        // {180=Mary, 165=ohn, 170=Emma}
        for(int i=0;i<heights.length;i++){
            nameindHeight.put(heights[i],names[i]);
        }
        System.out.println(nameindHeight);

        String[] myoutput=new String[names.length];

        Arrays.sort(heights);
        int[] descending = Arrays.stream(heights)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();//Step 2: Sort the height in descending
        System.out.println(Arrays.toString(descending));

        //For each height, get the
        for(int i=0;i<descending.length;i++) {
            int keyInMyMap=descending[i];
            String value=nameindHeight.get(keyInMyMap);

            myoutput[i]=value;

        }
        System.out.println(Arrays.toString(myoutput));
        return myoutput;
    }

    public static void main(String[] arg){
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        SortThePeople obj=new SortThePeople();
        obj.sortPeople(names,heights);

    }
}
