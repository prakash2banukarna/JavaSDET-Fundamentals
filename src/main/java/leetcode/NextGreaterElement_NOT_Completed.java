package leetcode;

import java.util.Arrays;

public class NextGreaterElement_NOT_Completed {

//https://leetcode.com/problems/next-greater-element-i/description/?envType=problem-list-v2&envId=array
    /*
    Conditions
    - nums1[i] should be available in nums2[j]
    - Then nums2[j+1] (next index value) should be greater than nums1
    - If nums1[i] should be available in nums2[j] but no more value present in num2(i.e last index), then -1
    - No condition satifies, then also nums1[i]

     */
    public int[] solution(int[] nums1, int[] nums2){ //confusing and poor solution

        int[] output = new int[nums1.length]; // creating a new array of size nums1.length
        for(int i=0;i< nums1.length;i++){
            for(int j=0;j< nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int z=j+1;z< nums2.length;z++){
                        if(nums2[z]>nums1[i]){
                            output[i]=nums2[z];
                            break;
                        }
                        else{
                            output[i]=-1;
                            break;
                        }
                    }
                    break;
                }
                else{
                    output[i]=-1;
                }
            }
        }
        System.out.println(Arrays.toString(output));
        return output;
    }



    public static void main(String[] arg){
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
//        int[] nums1 = {1,3,5,2,4};
//        int[] nums2 = {6,5,4,3,2,1,7};

        NextGreaterElement_NOT_Completed obj=new NextGreaterElement_NOT_Completed();
        obj.solution(nums1,nums2);


    }
}
