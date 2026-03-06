package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindMissingAndRepeatedValues {
    public void findMissingAndRepeatedValues(int[][] grid) {
// grid = [[9,1,7],[8,9,2],[3,4,6]]

        int rowLen= grid.length;
        int columnLen=grid[0].length;

        int repeatedInt=-1;
        List<Integer> myList =new ArrayList<>();

        for(int i=0;i< grid.length;i++){
            for(int j=0;j< grid[0].length;j++){
                if(!myList.contains(grid[i][j])){
                    myList.add(grid[i][j]);

                }
                else{
                    repeatedInt=grid[i][j];
                    System.out.println(repeatedInt);
                }
            }
        }







    }

    public static void main(String[] arg){
       int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};
        FindMissingAndRepeatedValues obj = new FindMissingAndRepeatedValues();
        obj.findMissingAndRepeatedValues(grid);
    }
}
