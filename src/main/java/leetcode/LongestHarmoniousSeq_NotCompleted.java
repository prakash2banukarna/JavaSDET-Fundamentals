package leetcode;

public class LongestHarmoniousSeq_NotCompleted {
    public int findLHS(int[] nums) {
//  int[] nums = {1,3,2,2,5,2,3,7};

        int myoutput=0;
        int indexPosition=0;
        while(indexPosition<nums.length){
            int incrementInLoop=0;
            for(int i=indexPosition;i<nums.length;i++){
                int temp=Math.abs(nums[indexPosition]-nums[i]);
                if(temp==1 || temp==0 && indexPosition!=i){
                    incrementInLoop++;
                }

            }
            indexPosition++; //After each value in For loop, increment the indexPosition so it considers next value.
            myoutput=Math.max(myoutput,incrementInLoop);

        }
        System.out.println(myoutput+1);
        return myoutput+1;

    }

    public static void main(String[] arg){
        int[] nums = {1,3,2,2,5,2,3,7};
        LongestHarmoniousSeq_NotCompleted obj= new LongestHarmoniousSeq_NotCompleted();
        obj.findLHS(nums);
    }
}
