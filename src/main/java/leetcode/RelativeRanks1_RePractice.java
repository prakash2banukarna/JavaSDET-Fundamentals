package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// Prakash solved it
// https://leetcode.com/problems/relative-ranks/description/?envType=problem-list-v2&envId=array
//Note: Took sometime to solve it, so repractice.

/*
How this problem is solved
Step 1: CLONE & SORT DESCENDING
  - Clone the original score array to preserve original positions.
  - Sort the clone ascending (Arrays.sort), then reverse it manually
    using a two-pointer swap → gives us scores ranked best to worst.
  - Example: [10,3,8,9,4] → sorted → [3,4,8,9,10] → reversed → [10,9,8,4,3]

Step 2: BUILD A RANK MAP (score → label)
  - Iterate the sorted-descending array.
  - Index 0 → "Gold Medal", Index 1 → "Silver Medal", Index 2 → "Bronze Medal"
  - Index 3+ → their rank as a string (i+1, since ranks are 1-based).
  - Store each (score value → rank label) in a HashMap.
  - Example map: {10="Gold Medal", 9="Silver Medal", 8="Bronze Medal", 4="4", 3="5"}

Step 3: BUILD OUTPUT ARRAY USING ORIGINAL ORDER
  - Iterate the ORIGINAL score array (not the sorted one).
  - For each score[i], look up its rank label in the HashMap.
  - Place it at myOutput[i] → preserves the original athlete positions.
  - Example: score=[10,3,8,9,4] → output=["Gold Medal","5","Bronze Medal","Silver Medal","4"]

 */
public class RelativeRanks1_RePractice {
    public String[] findRelativeRanks(int[] score) {
//score = [10,3,8,9,4]

        int[] scoreDesc = score.clone();

        Arrays.sort(scoreDesc);
        for(int i=0,j=scoreDesc.length-1;i<j;i++,j--){
            int temp=scoreDesc[i];
            scoreDesc[i]=scoreDesc[j];
            scoreDesc[j]=temp;
        }

        Map<Integer,String> ranking=new HashMap<>();
        for(int i=0;i< scoreDesc.length;i++){
            if(i==0){
                ranking.put(scoreDesc[i],"Gold Medal");
            }
            else if(i==1){
                ranking.put(scoreDesc[i],"Silver Medal");
            }
            else if(i==2){
                ranking.put(scoreDesc[i],"Bronze Medal");
            }
            else{
                ranking.put(scoreDesc[i],String.valueOf(i+1));
            }
        }



        String[] myOutput =new String[scoreDesc.length];

        for(int i=0;i< score.length;i++){
            myOutput[i]=ranking.get(score[i]);
        }

        return myOutput;

    }

    public static void main(String[] arg){
        int[] score = {10,3,8,9,4};
        RelativeRanks1_RePractice obj = new RelativeRanks1_RePractice();
        obj.findRelativeRanks(score);
    }
}
