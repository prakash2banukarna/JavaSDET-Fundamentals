package arrays;

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



    }






}
