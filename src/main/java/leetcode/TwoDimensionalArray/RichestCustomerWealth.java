package leetcode.TwoDimensionalArray;

import java.util.Arrays;

// Prakash solved it
// https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
//int[][] accounts = {{1,5},{7,3},{3,5}};
        int myOPutput=0;
        int rowLen= accounts.length;
        int coulumLen=accounts[0].length;

        for(int r=0;r<rowLen;r++){
            int eachRowSum=0;
            for(int c=0;c<coulumLen;c++){
                eachRowSum=eachRowSum+accounts[r][c];
            }
            myOPutput=Math.max(myOPutput,eachRowSum);
        }
        System.out.println(myOPutput);
        return myOPutput;

    }



    public static void main(String[] arg){
        int[][] accounts = {{1,5},{7,3},{3,5}};
        RichestCustomerWealth obj =new RichestCustomerWealth();
        obj.maximumWealth(accounts);
    }
}
