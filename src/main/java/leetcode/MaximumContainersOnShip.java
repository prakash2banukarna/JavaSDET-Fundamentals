package leetcode;
// Prakash solved it
//https://leetcode.com/problems/maximum-containers-on-a-ship/description/

//Note: this took lot of time to understand the solution.
public class MaximumContainersOnShip {
    public int maxContainers(int n, int w, int maxWeight) {
//n = 2, w = 3, maxWeight = 15
        if((n*n) * w <maxWeight){
            return (n * n);
        }
        else
            return maxWeight / w;
    }

    public static void main(String[] arg){
        int n = 2;
        int w = 3;
        int maxWeight = 15;
        MaximumContainersOnShip obj = new MaximumContainersOnShip();
        obj.maxContainers(n,w,maxWeight);
    }
}
