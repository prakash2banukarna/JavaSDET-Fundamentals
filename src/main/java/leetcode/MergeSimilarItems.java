package leetcode;

import java.util.*;
// Prakash solved it
// https://leetcode.com/problems/merge-similar-items/description/

/*
1) Initialise HashMap
2) For two list , add the Listvalue as hashmap key and Listweight has hashmap value
3) If key (Listvalue) is already present , sum the weight
4) Ascending order it using TreeMap
5) Iterate the hasMap and add the Key an value in List
 */
public class MergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> myOutput=new ArrayList<>();

        HashMap<Integer,Integer> valueWeight=new HashMap<>(); //This you can create TreeMap instead , so it will be ordered in ascending order while adding

        for(int i=0;i<items1.length;i++){
            valueWeight.put(items1[i][0],items1[i][1]); // items1[0][i] = value , items1[i][1] =weight
        }

        for(int i=0;i<items2.length;i++){
            int weightCount=valueWeight.getOrDefault(items2[i][0],0);
            /*
            checking if the value is already present or not in valueWeight HashMap. if present fetching the weight or defaulting the weight to 0 (ie. weightCount)
            Then below step, adds the weight and updates the hashmap
             */
            valueWeight.put(items2[i][0],weightCount+items2[i][1]);
        }

        //Do ascending order and then iternate the HashMap and put the value in List myOutput

        Map<Integer,Integer> valueWeightAscending=new TreeMap<>(valueWeight);


        for(Map.Entry<Integer,Integer> keyValue: valueWeightAscending.entrySet()){
            List tempLst=new ArrayList();
            tempLst.add(keyValue.getKey());
            tempLst.add(keyValue.getValue());
            myOutput.add(tempLst);

        }

        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        int[][] items1 ={{1,1},{4,5},{3,8}};
        int[][] items2={{3,1},{1,5}};
        MergeSimilarItems obj= new MergeSimilarItems();
        obj.mergeSimilarItems(items1,items2);

    }
}
