package leetcode.HashMap_Example;

import java.util.*;
// Prakash solved it
// https://leetcode.com/problems/rings-and-rods/description/?envType=problem-list-v2&envId=hash-table

public class RingsAndRods {
    public int countPoints(String rings) {
//rings = "B0B6G0R6R0R6G9"
//        Map<String, List<String>> rodAndColours=new HashMap<>();

        String[] ringsArr=rings.split("");
//        Map<String, List<String>> rodAndColours=new HashMap<>(); // First i did this
        Map<String, Set<String>> rodAndColours=new HashMap<>();


        for(int i=0;i<ringsArr.length;i+=2){
            String colour=ringsArr[i];
            rodAndColours.computeIfAbsent(ringsArr[i+1],k->new HashSet<>() {
            }).add(colour);
        }
        System.out.println(rodAndColours);

        int count=0;
        for(Map.Entry<String, Set<String>> keyValues:rodAndColours.entrySet()){
            if(keyValues.getValue().size()>=3){
                count++;
            }
        }
        System.out.println(count);
    return count;
    }

    public static void main(String[] arg){
        String rings = "B0B6G0R6R0R6G9";
        RingsAndRods obj=new RingsAndRods();
        obj.countPoints(rings);
    }
}
