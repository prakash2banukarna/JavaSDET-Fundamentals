
// Prakash solved it
// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/

public class CountNumPairsAbsoluteDiffK {
    public int countKDifference(int[] nums, int k) {
//nums = [1,2,2,1], k = 1

        int myoutput=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    myoutput++;
                }
            }
        }
        System.out.println(myoutput);
        return myoutput;
    }

    public static void main(String[] arg){
        int[] nums = {1,2,2,1};
        int k = 1;
        CountNumPairsAbsoluteDiffK obj=new CountNumPairsAbsoluteDiffK();
        obj.countKDifference(nums,k);
    }
}
