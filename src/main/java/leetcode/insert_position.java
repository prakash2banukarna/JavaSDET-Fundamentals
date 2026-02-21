package leetcode;

//https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=array
// Action : to find better solution

public class insert_position {

    public int positionindex(int[] numss,int targett){

        for(int i=0; i <numss.length; i++){
            if(numss[i]==targett) {
                System.out.println("My output " +i);
                return i;
            }
            else if(numss[i]>targett){
                System.out.println("My output in else statement" + (i));
                return i;

            }
        }
        System.out.println("My output in else statement" + numss.length);
        return numss.length;
    }

    public static void main(String[] arg){
        int[] nums = {1,3,5,6};
        int target = 7;
        insert_position positionInd =new insert_position();
        positionInd.positionindex(nums,target);
    }
}
