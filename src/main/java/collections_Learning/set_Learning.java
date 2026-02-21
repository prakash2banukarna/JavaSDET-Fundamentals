package collections_Learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class set_Learning {
    /*
    - Hetrogenous allowed
    - Insertion order not preserved (No index)
    - Duplicate elements not allowed

     */

    /*
    Search the value in Set using contains.
     */

    public static void main(String[] arg){
            HashSet mySet = new HashSet();
//        Set mySet2 =new HashSet(); // child class object

//    HashSet<String> mySet3 = new HashSet<String>();

        //Adding elements into hashSet
        mySet.add("Prakash");
        mySet.add(100);
        mySet.add(100); // duplicate wont be added
        mySet.add(true);
        mySet.add("Rudhran");

        System.out.println("mySet: " +mySet); //[100, Prakash, true]

        //Removing elements
        mySet.remove("Prakash"); // you have to specif the value which needs to be removed,

        //Access specific element - Not possible

        //Convert hashSet to arraylist

        ArrayList obj3=new ArrayList(mySet);
        System.out.println("obj3: " +obj3);

        /*
        Read all the elements from Set
        Tip : using normal for loop we cant read the data ,becuase it doesnt have index

        using enhanced for loop only
         */

        for (Object x : mySet){
            System.out.println(x);
        }






    }





}
