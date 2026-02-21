package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/intersection-of-two-arrays/description/?envType=problem-list-v2&envId=array
public class Intersection_NOT_Completed {

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> outputLst =new ArrayList<>();
        for(int n1=0;n1< nums1.length;n1++){
            for(int n2=0;n2< nums2.length;n2++){
                if(nums1[n1]==nums2[n2]){
                    outputLst.add(nums1[n1]);
                    break;
                }
            }
        }

        int[] finalOutput=new int[outputLst.size()];
        for(int x=0;x<outputLst.size();x++){
            finalOutput[x]= outputLst.get(x);
        }
        System.out.println(Arrays.toString(finalOutput));

        return new int[]{};


    }


    public static void main(String[] arg){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        Intersection_NOT_Completed obj= new Intersection_NOT_Completed();
        obj.intersection(nums1,nums2);


    }
}
