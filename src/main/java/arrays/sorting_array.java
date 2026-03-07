package arrays;
// Refer : https://claude.ai/chat/9c33a70b-243d-4202-9357-db95235a5e9d
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class sorting_array {

    public static void main(String[] arg){


        int nums[]={55,12,33,23,45,2,99,32,10};

        //How to print the array using in-built method
        System.out.println(Arrays.toString(nums)); // [55, 12, 33, 23, 45, 2, 99, 32, 10]

        //Sorting from asc to desc
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); //[2, 10, 12, 23, 32, 33, 45, 55, 99]

        //Sort in descending order
        int[] arr = {4, 2, 9, 1, 5, 3};
        int[] descending = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        //Sort in descening order using manual reverse
        int[] arrMan = {4, 2, 9, 1, 5, 3};
        Arrays.sort(arrMan); //Sorting ascending first
        //Then reverse manually
        for(int i=0,j=arrMan.length -1; i<j;i++,j--){
            int temp =arrMan[i];
            arrMan[i]=arrMan[j];
            arrMan[j]=temp;
        }

        System.out.println("Manual Array sorting in des :" +Arrays.toString(arrMan));



    }






}
