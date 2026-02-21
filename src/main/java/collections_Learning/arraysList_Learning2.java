package collections_Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraysList_Learning2 {
    public void removePractice(){
        List<Integer> myList = List.of(1,12,454,534,6,123,98,7,5565);
        List<Integer> mutableList = new ArrayList<>(myList);  // Size: 9 elements (indices 0-8)
        mutableList.subList(7, 9).clear();  // Removes indices 7 and 8 (values 7 and 5565)
        System.out.println(mutableList);  // [1, 12, 454, 534, 6, 123, 98]

    }

    //Adding or concatinating two list
    public void addTwoList(){
        List<Integer> myList1 = new ArrayList<>(List.of(1, 12, 454)); //onLY this works
        List<Integer> myList2 = List.of(9,67,10,11);
        myList1.addAll(myList2);
        System.out.println("After adding/Appending two lists :" +myList1);
    }



    public static void main(String[] arg){
        arraysList_Learning2 obj=new arraysList_Learning2();
        obj.removePractice();
        obj.addTwoList();
    }
}
