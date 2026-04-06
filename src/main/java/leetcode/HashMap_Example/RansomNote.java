package leetcode.HashMap_Example;

import java.util.HashMap;
import java.util.Map;
// Prakash solved it
// https://leetcode.com/problems/ransom-note/description/?envType=problem-list-v2&envId=hash-table

/*
 * Problem: Ransom Note (LeetCode 383)
 * Given two strings ransomNote and magazine, return true if ransomNote
 * can be constructed using the letters from magazine (each letter used once).
 *
 * Approach: HashMap Frequency Count
 * Time Complexity : O(m + n) — where m = ransomNote.length(), n = magazine.length()
 * Space Complexity: O(1)  — at most 26 unique characters (lowercase letters)
 *
 * Step 1: Build a frequency map for ransomNote
 *         e.g. "aa" → {a=2}
 *
 * Step 2: Build a frequency map for magazine
 *         e.g. "aab" → {a=2, b=1}
 *
 * Step 3: For each character in ransomNote's map, check if magazine has
 *         enough occurrences. If magazine count < required count → return false.
 *
 * Key API used:
 *   getOrDefault(key, 0) — returns existing count or 0 if key not present
 *
 * Example:
 *   ransomNote = "aa", magazine = "aab" → true  (magazine has 2 a's)
 *   ransomNote = "aa", magazine = "ab"  → false (magazine only has 1 a)
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
//
        Map<Character,Integer> ransomNoteCount= new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            int count=ransomNoteCount.getOrDefault(ransomNote.charAt(i),0);
            ransomNoteCount.put(ransomNote.charAt(i),count+1);
        }

        Map<Character,Integer> magazineCount= new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            int count=magazineCount.getOrDefault(magazine.charAt(i),0);
            magazineCount.put(magazine.charAt(i),count+1);
        }

        System.out.println(magazineCount);

        for(var rans:ransomNoteCount.entrySet()){
            char tempRans=rans.getKey();
            int countInMagazine=magazineCount.getOrDefault(tempRans,0);
            if(countInMagazine<rans.getValue()){ // if countInMagazie is less, then we cant construct ransomNote
                System.out.println(false);
                return false;
            }

        }
        System.out.println(true);
        return true;

    }

    public static void main(String[] arg){
        String ransomNote = "aa";
        String magazine = "aab";
        RansomNote obj= new RansomNote();
        obj.canConstruct(ransomNote,magazine);
    }
}
