package leetcode;

import java.util.ArrayList;
import java.util.List;
//Prakash solved it
//https://leetcode.com/problems/find-the-peaks/description/
public class FindThePeaks {
    public List<Integer> findPeaks(int[] mountain) {
//int[] mountain = {2,4,4};
        List<Integer> myOutput = new ArrayList<>();
        for(int i=1;i<mountain.length-1;i++){
            if(mountain[i] > mountain[i - 1] && mountain[i]>mountain[i+1]){
                myOutput.add(i);
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] a){
//        int[] mountain = {2,4,4};
//        int[] mountain = {1,4,3,8,5};
        int[] mountain = {4,2,1};
        FindThePeaks obj=new FindThePeaks();
        obj.findPeaks(mountain);
    }


}
