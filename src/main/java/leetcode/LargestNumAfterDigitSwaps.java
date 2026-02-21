package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumAfterDigitSwaps {
    // int num = 65875;

    public int largestInteger(int num) {
        String[] str=String.valueOf(num).split("");

        List<Integer> evenNum=new ArrayList<>();
        List<Integer> oddNum=new ArrayList<>();

        for(int i=0;i<str.length;i++){
            int temp=Integer.parseInt(str[i]);
            if(temp%2==0){
                evenNum.add(temp);
            }
            else{
                oddNum.add(temp);
            }
        }
        evenNum.sort(Collections.reverseOrder());
        oddNum.sort(Collections.reverseOrder());

        String myOutputstr="";
        for(int i=0,j=0;i<evenNum.size() || j<oddNum.size();i++ ,j++){
            if(i<evenNum.size()){
                int tempEven=evenNum.get(i);
                myOutputstr=myOutputstr+tempEven;
            }
            if (j<oddNum.size()) {
                int tempOdd=oddNum.get(j);

                myOutputstr=myOutputstr+tempOdd;
            }

        }
        System.out.println(Integer.parseInt(myOutputstr));
        return Integer.parseInt(myOutputstr);
    }

    public static void main(String[] arg){
//        int num = 65875;
        int num = 247;
        LargestNumAfterDigitSwaps obj = new LargestNumAfterDigitSwaps();
        obj.largestInteger(num);
    }

}
