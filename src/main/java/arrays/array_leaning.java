package arrays;


/*
Array is collection of elements of same data types(Homogeneous) .
We can store multiple values in single variable
 */
public class array_leaning {

    public void arrayValues(){
        int nums[] = {12,44,55,2,55}; // systax to create a defined size array

        Object obj[]={"prakash",100,true,5.4};
    }

    public static void main(String[] arg){
        // I want to add 3 songs into my playlist - Option 1

        String[] playList_Slow = new String[3]; // length = 3 , index values : 0 , 1 , 2
        /*
        DataType[denotes the array]
        new array of dataType of size 3
         */
        playList_Slow[0]="slow song 0";
        playList_Slow[1]="slow song 1";
        playList_Slow[2]="slow song 2";

        int x=playList_Slow.length;
        System.out.println(playList_Slow[0]);

        // I want to add 3 songs into my playlist - Option 2

        String[] playlist_fast = {"fast song 1","fast song 2","fast song 3","fast song 4"};

        System.out.println("Length of array before increasing the size: " +playlist_fast.length); //4

        // if you want to increase the array , then declare the size
        playlist_fast = new String[5];
        System.out.println("Length of array after increasing the size: " +playlist_fast.length); //5

        // if you have not assigned the value to the array, it will have null value
        System.out.println("Value of unassigned array: " +playlist_fast[4]); //add the index ,null is the value
    }
}
