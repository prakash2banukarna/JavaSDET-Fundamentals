package leetcode;

import java.util.HashMap;
import java.util.Map;
// Prakash solved it
// https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/description/

/*
 Example input: num = "1210"
 The goal: Each index i in num should contain the count of digit i in the entire string.
 For example, "1210" means:
 index 0 → value '1' → means there should be one '0' in num
 index 1 → value '2' → means there should be two '1's in num
 index 2 → value '1' → means there should be one '2' in num
 index 3 → value '0' → means there should be zero '3's in num
 */


public class CheckNumHasEqualDigitCountVal {
    public boolean digitCount(String num) {


        // Step 1: Convert string into an array of single-character strings
        String[] str = num.split("");

        // Step 2: Create a HashMap to count occurrences of each digit in the string
        Map<String, Integer> numCount = new HashMap<>();

        // Step 3: Count each digit's frequency and store in numCount
        for (int i = 0; i < str.length; i++) {
            int count = numCount.getOrDefault(str[i], 0);  // get current count, default to 0 if not present
            numCount.put(str[i], count + 1);               // increment and update map
        }

        // Step 4: Validate each index condition based on the problem definition
        for (int j = 0; j < str.length; j++) {
            int count = numCount.getOrDefault(String.valueOf(j), 0); // get how many times digit j appears
            int expectedCount = Integer.parseInt(str[j]);            // number that num[j] claims count should be

            if (count != expectedCount) {
                System.out.println(false);
                return false;
            }
        }

        System.out.println(true);
        return true;
    }


    public static void main(String[] arg){
        String num = "1210";
        CheckNumHasEqualDigitCountVal obj = new CheckNumHasEqualDigitCountVal();
        obj.digitCount(num);

    }
}
