package leetcode;
// Partially completed
// https://leetcode.com/problems/find-the-pivot-integer/description/

/*

8 +7 +6 =
36 - (8 + 7 ) =21
 */
public class FindPivotInteger_NotCompleted {
    public int pivotInteger(int n) {
//int n=8;
        int sum=0;
        int i=0;
        while(i<=8){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);

        int reverseSum=8;
        sum=sum-n;
        int tempN=8;
        while(sum>reverseSum){
            tempN--; // so it will be  8 ,  7 , 6
            reverseSum=reverseSum + (tempN);
            if(sum==reverseSum){
                System.out.println(tempN);
                return tempN;
            }

            sum=sum - (tempN);
        }

        return -1;
    }

    public static void main(String[] arg){
        int n=8;
        FindPivotInteger_NotCompleted obj = new FindPivotInteger_NotCompleted();
        obj.pivotInteger(n);
    }
}
