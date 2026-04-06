package leetcode;

import java.util.HashMap;
import java.util.Map;

// Prakash solved it
// https://leetcode.com/problems/number-of-lines-to-write-string/description/?envType=problem-list-v2&envId=array

public class NumberOfLinesWriteString {
    public int[] numberOfLines(int[] widths, String s) {

        // ─────────────────────────────────────────────
        // STEP 1: Build alphabet → pixel width map
        // Maps each letter to its pixel width from the widths[] array
        // e.g. { 'a'→4, 'b'→10, 'c'→10, ... }
        // ─────────────────────────────────────────────
        Map<String,Integer> alphbetMap = new HashMap<>();
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for(int i =0;i<alpha.length();i++){
            alphbetMap.put(String.valueOf(alpha.charAt(i)),widths[i]);
        }

        int count=0; // tracks number of FULL lines completed
        int tempPixel = 0; // tracks current line's pixel width
        for(int i=0;i<s.length();i++){
            String key=String.valueOf(s.charAt(i));

            // ─────────────────────────────────────────────
            // STEP 2: Look up pixel width of current character
            // and add it to the current line's running total
            // ─────────────────────────────────────────────
            tempPixel=tempPixel + alphbetMap.get(key); //Step 2: Get the pixel value for each of characters in S string

            if(tempPixel<=100){
                // ─────────────────────────────────────────────
                // STEP 3: Still within 100px limit → stay on
                // the same line and move to the next character
                // ─────────────────────────────────────────────
                continue;
            }
            else{
                // ─────────────────────────────────────────────
                // STEP 4: Exceeded 100px → current line is full
                // - Increment full line count
                // - Reset pixel counter to 0
                // - Place the CURRENT character on the NEW line
                //   (re-add its width to the fresh line)
                // ─────────────────────────────────────────────
                count=count+1;
                tempPixel = 0;
                tempPixel=tempPixel + alphbetMap.get(key);
            }
        }

        // ─────────────────────────────────────────────
        // STEP 5: Return result
        // - count+1 → total lines (add 1 for the last incomplete line)
        // - tempPixel → pixel width of that last line
        // - new int[]{...} is Java syntax for returning an inline array
        // ─────────────────────────────────────────────
        return new int[]{count+1,tempPixel}; //This is how to create a array[]


    }


    public static void main(String[] arg){
//        int[] widths  = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
//        String s = "bbbcccdddaaa";
        int[] widths  = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";

        NumberOfLinesWriteString obj= new NumberOfLinesWriteString();
        obj.numberOfLines(widths,s);
    }
}
