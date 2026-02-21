package leetcode.TwoDimensionalArray;

import java.util.Arrays;

public class NumberOfEquivalentDominoPairs_NotCompleted {


    public void numEquivDominoPairs(int[][] dominoes) {
// dominoes = [[1,2],[2,1],[3,4],[5,6]]

        for(int i=0;i<dominoes.length;i++){
            System.out.println(Arrays.toString(dominoes[i]));
        }

    }

    public static void main(String[] arg){
        int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
        NumberOfEquivalentDominoPairs_NotCompleted obj = new NumberOfEquivalentDominoPairs_NotCompleted();
        obj.numEquivDominoPairs(dominoes);
    }
}
