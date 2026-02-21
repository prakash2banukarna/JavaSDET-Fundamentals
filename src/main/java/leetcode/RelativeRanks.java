package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RelativeRanks {
    public void findRelativeRanks(int[] score) {
// int[] score = {5,4,3,2,1};

        List<Integer> myLst =new ArrayList<>();
        for(int s:score){
            myLst.add(s);
        }
        myLst.sort(Comparator.reverseOrder());
        System.out.println(myLst);


    }

    public static void main(String[] arg){
        int[] score = {5,4,3,2,1};
        RelativeRanks obj =new RelativeRanks();
        obj.findRelativeRanks(score);
    }

}
