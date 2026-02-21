package leetcode;
// Prakash solved it
// https://leetcode.com/problems/find-common-elements-between-two-arrays/description/
public class FindCommonElementsBetweenTwoArrays {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
//nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]
        int[] myoutput =new int[2];

        int nums1CountInNums2=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    nums1CountInNums2++;
                    break;
                }
            }
        }

        int nums2CountInNums1=0;
        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    nums2CountInNums1++;
                    break;
                }
            }
        }

        myoutput[0]=nums1CountInNums2;
        myoutput[1]=nums2CountInNums1;

        return myoutput;
    }



    public static void main(String[] arg){
        int[] nums1 = {4,3,2,3,1};
        int[] nums2 = {2,2,5,2,3,6};
        FindCommonElementsBetweenTwoArrays obj = new FindCommonElementsBetweenTwoArrays();
        obj.findIntersectionValues(nums1,nums2);
    }
}
