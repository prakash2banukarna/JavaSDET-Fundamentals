package leetcode;
// prakash solved it
// https://leetcode.com/problems/ant-on-the-boundary/description/
public class AntOnTheBoundary {
    public int returnToBoundaryCount(int[] nums) {
//nums = [2,3,-5]
        int myOutput=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum==0){ //Note: once the ant comes to zero, then its called boundary
                myOutput++;
            }
        }

        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        int[] nums = {2,3,-5};
        AntOnTheBoundary obj= new AntOnTheBoundary();
        obj.returnToBoundaryCount(nums);

    }
}
