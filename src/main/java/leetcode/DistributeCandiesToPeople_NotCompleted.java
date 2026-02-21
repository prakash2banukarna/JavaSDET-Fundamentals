package leetcode;

import java.util.Arrays;

public class DistributeCandiesToPeople_NotCompleted {
    public int[] distributeCandies(int candies, int num_people) {
//candies = 10, num_people = 3
        int[] myOutput =new int[num_people];

        int candiesDistributed=0;

        for(int i=0;i<num_people;i++){
            if(candiesDistributed + i + 1 <=candies){
                myOutput[i]= i +1; //First time giving 1 candies
                candiesDistributed = candiesDistributed + myOutput[i]; //Keep adding the candies distributed so far
            }
            else { //should distribute the remaining candies on the last index
                myOutput[i]=candies-candiesDistributed;
                candiesDistributed = candiesDistributed + myOutput[i];
            }
        }

        if(candiesDistributed !=candies){ //still candies are not distrubuted completely, then start again to first index
            myOutput[0]= myOutput[0] + (candies-candiesDistributed);
        }

        System.out.println(Arrays.toString(myOutput));
        return myOutput;

    }

    public static void main(String[] arg){
        int candies = 10;
        int num_people = 3;
        DistributeCandiesToPeople_NotCompleted obj=new DistributeCandiesToPeople_NotCompleted();
        obj.distributeCandies(candies,num_people);

    }


}
