package leetcode.Medium;
//Prakash solved it - Timeout exceeded
public class CountNumberOfBadPairs_Time_Exceeded {
    public long countBadPairs(int[] nums) {
//nums = [4,1,3,3]

        long myOutput=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(j-i !=nums[j] - nums[i]){
                    myOutput++;
                }
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        int[] nums = {1,2,3,4,5};
        CountNumberOfBadPairs_Time_Exceeded obj=new CountNumberOfBadPairs_Time_Exceeded();
        obj.countBadPairs(nums);
    }

}
