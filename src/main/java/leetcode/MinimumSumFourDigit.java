package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// prakash solved it
// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/description/


public class MinimumSumFourDigit {
    public int minimumSum(int num) {
//num = 2932
        List<Integer> split = new ArrayList<>();

        int temp=num;
        int lastDigit=0;
        while(temp>9){
            lastDigit = temp %10; // fetching the lastDigit
            split.add(lastDigit); // adding the lastDigit

            temp = temp/10; // removed the lastDigit (i.e remaining value)

            if(temp<10){ // if less than 10, then adding to list, because it doesnt go to while loop
                split.add(temp);
            }
        }

        Collections.sort(split); // 2,2,3,9

        // i need to do 23 + 39 , so i did (2 * 10 + 3 ) + ( 2*10 + 9)
        //Consider tens (*10 )
        int myOutput= (split.get(0) * 10 + split.get(2)) + (split.get(1) * 10 + split.get(3));
        System.out.println(myOutput);

        return myOutput;


    }

    public static void main(String[] arg){
        int num = 2932;
        MinimumSumFourDigit obj = new MinimumSumFourDigit();
        obj.minimumSum(num);
    }
}
