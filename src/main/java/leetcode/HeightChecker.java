package leetcode;

import java.util.Arrays;
//Prakash solved it
//https://leetcode.com/problems/height-checker/description/
public class HeightChecker {
    public int heightChecker(int[] heights) {
//heights = [1,1,4,2,1,3]
        int[] expectedHeight=new int[heights.length];
        expectedHeight=heights.clone();
        Arrays.sort(expectedHeight);
        int myOutput=0;

        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expectedHeight[i]){
                myOutput++;
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        int[] heights = {1,1,4,2,1,3};
        HeightChecker obj=new HeightChecker();
        obj.heightChecker(heights);
    }

}
