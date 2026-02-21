package leetcode;

import java.util.Arrays;
//Prakash solved it
// https://leetcode.com/problems/count-asterisks/description/

/*
Thinking Behind the Solution (Step by Step)
Understand the pattern in the string:
Every time you see a |, it acts as a boundary or divider.
Text between two | characters should be ignored when counting *.

-Split the string by the divider:
When you use split("\\|"), the string will be divided into sections that alternate like this:

Even indices (0, 2, 4, …) → text outside the bars (we care about these).

Odd indices (1, 3, 5, …) → text inside the bars (ignore these).

Example:
"l|*e*et|c**o|*de|" → ["l", "*e*et", "c**o", "*de", ""]

Focus only on even-index parts:
Since these are outside | boundaries, loop only through parts at index 0, 2, 4, etc.

Count the asterisks:
Inside those selected parts, check each character — if it is a *, increase the counter.

Return the total count.
This gives you the number of * found outside the paired | symbols.
 */
public class CountAsterisks {
    public int countAsterisks(String s) {
//s = "l|*e*et|c**o|*de|"
        int myOutput =0;
        String[] str = s.split("\\|"); // Note this when you split
        System.out.println(Arrays.toString(str));
        for(int i=0;i< str.length;i++){
            if(i%2==0){ // we need only even index
                String temp=str[i];
                for(int j=0;j<temp.length();j++){
                    char chAsterisks=temp.charAt(j);
                    if(String.valueOf(chAsterisks).equals("*")){
                        myOutput++;
                    }
                }
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        String s=  "l|*e*et|c**o|*de|";
        CountAsterisks obj = new CountAsterisks();
        obj.countAsterisks(s);
    }
}
