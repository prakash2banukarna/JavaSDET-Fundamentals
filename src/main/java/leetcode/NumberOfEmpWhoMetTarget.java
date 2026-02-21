package leetcode;
// Prakash solved it
// https://leetcode.com/problems/number-of-employees-who-met-the-target/description/
public class NumberOfEmpWhoMetTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
//int[] hours = {0,1,2,3,4}, target = 2
        int myOutput=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                myOutput++;
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        int[] hours = {0,1,2,3,4};
        int target = 2;
        NumberOfEmpWhoMetTarget obj = new NumberOfEmpWhoMetTarget();
        obj.numberOfEmployeesWhoMetTarget(hours,target);
    }

}
