package leetcode;
// Prakash solved it
// https://leetcode.com/problems/count-tested-devices-after-test-operations/description/

/* Thiking behind how this problem is solved
Revised Thinking Steps:

- Iterate through each element in the batteryPercentages array.
- When you find a battery value greater than 0, it means this device is tested — increment the test count.
- After testing a device, simulate the effect of the test by reducing all remaining batteries (from the current index onward) by 1.
- Ensure no battery percentage becomes negative by taking max(batteryPercentages[j] - 1, 0).
- Continue until all elements are processed, and return the final count of tested devices.
 */
public class CountTestedDevicesAfterTestOpe {
    public int countTestedDevices(int[] batteryPercentages) {
//batteryPercentages = [1,1,2,1,3]

        int myoutput=0;
        for(int i=0;i<batteryPercentages.length;i++){

            if(batteryPercentages[i]>0){
                myoutput++;

                for(int j=i;j<batteryPercentages.length;j++){
                    batteryPercentages[j]=Math.max(batteryPercentages[j]-1,0); //Retaining the max value
                }
            }
        }
        System.out.println(myoutput);
        return myoutput;
    }

    public static void main(String[] arg){
//        int[] batteryPercentages = {1,1,2,1,3};
        int[] batteryPercentages = {0,2};
        CountTestedDevicesAfterTestOpe obj = new CountTestedDevicesAfterTestOpe();
        obj.countTestedDevices(batteryPercentages);
    }
}
