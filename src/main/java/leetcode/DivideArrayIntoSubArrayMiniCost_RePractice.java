package leetcode;
//Prakash solved it
//https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/description/
/* Thinking behind the solution:
To correctly maintain the first, second, and third smallest values, we need to update them in the right order whenever a new smaller number appears.
Once we detect that the current number (nums[i]) is smaller than the existing second-smallest value, it means that the current second-smallest must now become the third-smallest — because its position has shifted down.
For example, consider the array:
nums = {1, 6, 49, 35, 41, 4, 31, 39, 36, 39}
Without the step thirdSmallest = secondSmallest before reassigning secondSmallest = nums[i], we would lose the previous second-smallest value.
Let’s walk through the situation when nums[i] = 4:

Current smallest = 1
Current second-smallest = 6
Current third-smallest = 35

When 4 comes in, second-smallest should update from 6 to 4. But before that, the old 6 should “move down” to become the new third-smallest.
If we skip this step, the third-smallest remains 35, which is incorrect.
Hence, we must first assign thirdSmallest = secondSmallest before updating secondSmallest = nums[i];
This preserves the correct ordering among the three smallest elements at all times.
*/

public class DivideArrayIntoSubArrayMiniCost_RePractice {
    //Input: nums = [1,2,3,12]

    public int minimumCost(int[] nums) {
        int firstValue=nums[0];
        int secondSmallest=nums[1];
        int thridSmallest=nums[2];
        for(int i=3;i<nums.length;i++){
            if(nums[i]<secondSmallest){
                thridSmallest=secondSmallest < thridSmallest ? secondSmallest : thridSmallest; //Added for this input --> [10,3,1,1]
                secondSmallest=nums[i];
            }
            else if(nums[i]<thridSmallest){
                thridSmallest=nums[i];
            }
        }

        System.out.println(firstValue+secondSmallest+thridSmallest);
        return firstValue+secondSmallest+thridSmallest;
    }

    public static void main(String[] arg){
//        int[] nums = {1,23,3,12,2,3,2,2,15,8};
        int[] nums = {1,6,49,35,41,4,31,39,36,39};
        DivideArrayIntoSubArrayMiniCost_RePractice obj = new DivideArrayIntoSubArrayMiniCost_RePractice();
        obj.minimumCost(nums);
    }

}
