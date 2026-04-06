package leetcode;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {

//        int startPoint=cost[0]<cost[1] ? 0 : 1; //Whichever is lower, taking that index as starting point


        int startPoint=0;
        int count=cost[startPoint];
        for(int i=startPoint;i<cost.length-1;){
            if(i<cost.length-2){
                int toAddIndex =cost[i+1]<cost[i+2] ? i+1 : i+2;
                count =count+cost[toAddIndex];
                i=toAddIndex;
            }
            else if(i<cost.length-1){
                i+=2;
            }
        }
        System.out.println(count);


        int startPoint1=1;
        int count1=cost[startPoint1];
        for(int i=startPoint1;i<cost.length-1;){
            if(i<cost.length-2){
                int toAddIndex =cost[i+1]<cost[i+2] ? i+1 : i+2;
                count1 =count1+cost[toAddIndex];
                i=toAddIndex;
            }
            else if(i<cost.length-1){
                i+=2;
            }
        }
        System.out.println(count1);
        System.out.println(Math.min(count,count1));
        return Math.min(count,count1);

    }

    public static void main(String[] arg){
//        int[] cost = {1,100,1,1,1,100,1,1,100,1,200};
        int[] cost = {10,15,20};
        MinCostClimbingStairs obj= new MinCostClimbingStairs();
        obj.minCostClimbingStairs(cost);
    }
}
