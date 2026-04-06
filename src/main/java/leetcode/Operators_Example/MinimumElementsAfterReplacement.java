package leetcode.Operators_Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Prakash solved it
// https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/description/
public class MinimumElementsAfterReplacement {

    // Take one step at a time, so take one value and implement the core logic
    public void minElement_SolvedWithSingleNumValue(int nums) {
        int lastDigit=0;
        int remainDigit=nums;

        int TempSum=0;
        while(remainDigit>9){
            lastDigit = remainDigit %10 ; //Found the lastDigit
            TempSum = TempSum + lastDigit ; //added the lastDigit

            remainDigit = remainDigit / 10;

            if(remainDigit<10){ // if less than 10, then add to temp Sum
                TempSum = TempSum + remainDigit ;
            }
            //else it again goes to qhile loop


        }

        System.out.println(TempSum);
    }


    //Original problem
    public int minElement(int[] nums) {
//
        List<Integer> sumDigits =new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            if(nums[i]>9){
                int lastDigit=0;
                int remainDigit=nums[i];

                int TempSum=0;

                while(remainDigit>9){
                    lastDigit = remainDigit %10 ; //Found the lastDigit
                    TempSum = TempSum + lastDigit ; //added the lastDigit

                    remainDigit = remainDigit / 10;

                    if(remainDigit<10){ // if less than 10, then add to temp Sum
                        TempSum = TempSum + remainDigit ;
                    }
                    //else it again goes to qhile loop

                }

                //Make sure to add the TempSum into the List once it comes out of while loop
                sumDigits.add(TempSum);
            }
            else{
                sumDigits.add(nums[i]);
            }


            //
        }
        Collections.sort(sumDigits);
        System.out.println(sumDigits);

        return sumDigits.get(0);

    }

    public static void main(String[] arg){
        int[] num={999,19,199};
        MinimumElementsAfterReplacement obj=new MinimumElementsAfterReplacement();
        obj.minElement(num);
    }
}
