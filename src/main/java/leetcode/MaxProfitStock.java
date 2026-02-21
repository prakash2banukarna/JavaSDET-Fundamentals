package leetcode;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=problem-list-v2&envId=array

public class MaxProfitStock {

    // Working but time exceeded
    public int profit(int[] prices){

        int myProfit =0;

        for(int i=0; i<prices.length; i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i] && prices[j]-prices[i] >myProfit ){
                    myProfit =prices[j]-prices[i];

                }
            }
        }
        System.out.println("My profit : " +myProfit);
        return myProfit;
    }


    public static void main(String[] arg){
        int[] prices = {7,1,5,3,6,4};
        MaxProfitStock maxProfitStock =new MaxProfitStock();
        maxProfitStock.profit(prices);




    }
}
