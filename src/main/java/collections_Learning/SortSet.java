package collections_Learning;

import java.util.*;

/*
No, a regular Java Set (like HashSet) does not guarantee returning values in ascending order, as it maintains no specific iteration order.
However, a SortedSet (such as TreeSet) automatically sorts elements in ascending order based on their natural ordering or a custom comparator.
 When iterating over a TreeSet, elements appear from smallest to largest by default.

 */
public class SortSet {

    public void SortedSetUsingTreeSet(){
        // Option 1: Using Tree set
        Set mySet = new HashSet(Arrays.asList(13,5,2,3, 1,1, 2,4,5));
        System.out.println("mySet :" +mySet); //[13,1, 2, 3, 4, 5] - Not necessarily it will be ordered.
        Set mySortedSet = new TreeSet(mySet); //This return the value in order.
        System.out.println("mySortedSet :" +mySortedSet); // [1, 2, 3, 4, 5, 13] - Ascending order by default.

    }

    public void option2(){ // Straight forward and easy
        List lst= List.of(23,12,10,1,2,5,5,2);
        TreeSet myTreeSet=new TreeSet<>(lst);
        System.out.println("myTreeSet :" +myTreeSet); //[1, 2, 5, 10, 12, 23]

    }

    public void SortSetDescOrder(){ // Sorting set in desc order
        List lst= List.of(23,12,10,1,2,5,5,2);
        TreeSet myTreeSetInDescOrd=new TreeSet(Collections.reverseOrder()); //Reverse
        myTreeSetInDescOrd.addAll(lst);
        System.out.println("myTreeSetInDescOrd :" +myTreeSetInDescOrd); // [23, 12, 10, 5, 2, 1]


    }


    public static void main(String[] arg){
        SortSet obj= new SortSet();
//        obj.SortedSetUsingTreeSet();
//        obj.option2();
        obj.SortSetDescOrder();

    }
}
