package leetcode.TwoDimensionalArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Prakash solved but timelimit exceed
// https://leetcode.com/problems/number-of-equivalent-domino-pairs/description/
public class NumberOfEquivalentDominoPairs_NotCompleted {


    public int numEquivDominoPairs_TimeExceeded(int[][] dominoes) {
// dominoes = [[1,2],[2,1],[3,4],[5,6]]

        int count=0;
        for(int i=0;i<dominoes.length;i++){
            for(int j=i+1;j<dominoes.length;j++){
                Arrays.sort(dominoes[i]);
                Arrays.sort(dominoes[j]);
                if(Arrays.equals(dominoes[i],dominoes[j])){
                    count++;
                }

            }

        }
        System.out.println(count);
        return count;

    }

    public static void main(String[] arg){
        int[][] dominoes = {{1,2},{1,2},{1,2},{5,6}};
        NumberOfEquivalentDominoPairs_NotCompleted obj = new NumberOfEquivalentDominoPairs_NotCompleted();
        obj.numEquivDominoPairs_TimeExceeded(dominoes);
    }
}
