package leetcode.Operators_Example;

// Prakash solved it
// https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/


public class DifferanceBetweenEleSumDigitSum {
    public int differenceOfSum(int[] nums) {


        int digitsSum=0;
        int eleSum=0;

        for(int i=0;i< nums.length;i++){
            eleSum = eleSum + nums[i];

            if(nums[i]>9){
                // Note: I have only implemented the below code taking example as num =155 and then added the above for loop and if loop . Refer Operator example
                int temp=nums[i];
                while(temp>9){
                    digitsSum=(temp%10) + digitsSum;
                    temp=temp/10;

                    if(temp<10){
                        digitsSum = digitsSum + temp;
                    }
                }
            }
            else{
                digitsSum = digitsSum + nums[i];
            }


        }

        System.out.println(Math.abs(eleSum-digitsSum));
        return Math.abs(eleSum-digitsSum);



    }

    public static void main(String[] arg){
        int[] nums = {1,15,6,3};
        DifferanceBetweenEleSumDigitSum obj =new DifferanceBetweenEleSumDigitSum();
        obj.differenceOfSum(nums);
    }
}
