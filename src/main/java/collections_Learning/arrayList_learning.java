package collections_Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List is dynamic in nature, no need to define the size while creating a list
 * Homogeneous (i.e same datatypes)
 * Hetrogeneous data are allso allowed (can hold all dataTypes)
 * Arranged in order using index
 */

 /*
        ArrayList is a class
        Uses raw types: no generics, so obj1 can hold any Object like string, integer , boolean , nulls,
         */

public class arrayList_learning {




    public static void main(String[] arg){
        ArrayList obj1 = new ArrayList();


        List obj2 = new ArrayList<>(); // List is a child class and ArrayList is parent class,(extends)
        ArrayList<String> obj3 =new ArrayList<>(); //Stores only String obj
        ArrayList<Integer> obj4 = new ArrayList<>();

        obj1.add("Rudhran");
        obj1.add("dummy");
        System.out.println(obj1);
        obj1.add(1,"Praksh"); // add method here refers to method override
        obj1.add(null);
        obj1.add(100);
        System.out.println(obj1); // [Rudhran, Praksh, dummy, null, 100]

        //How to remove ?
        obj1.remove(2); //remove method using index

        //How to update the value
        obj1.set(1,"Prakash K");

        //How to fetch the value
        obj1.get(0); //using index


        System.out.println(obj1); //[Rudhran, Prakash K, null, 100]

        //Remove all the elements/clear
        obj1.clear();

        System.out.println("clear " +obj1);

        /*
In an arrayList, clear() and removeAll() can both end up emptying the list, but they are meant for different use cases and behave slightly differently.

Core difference
* clear()
    * Purpose: Remove all elements from the list and make it empty.
    * Signature: public void clear() (no arguments, returns nothing).
    * Effect: After calling list.clear(),list.size() becomes 0.
    * Performance: Simple and typically faster (just nulls out elements and sets size to 0).
    * When to use: When your intention is to completely reset/empty the list.
* removeAll(Collection<?> c)
    * Purpose: Remove only those elements from the list that are also present in the given collections.
    * Signature: public boolean removeAll(Collection<?> c) (takes a collection, returns true if list changed).
    * Effect: After list.removeAll(c), only elements that matched items in c are removed; other elements stay.
    * Special case: list.removeAll(list) (or list.removeAll(new ArrayList<>(list))) will also empty the list, but with more work and worse performance than clear().
    * When to use: When you want to remove a subset of elements specified by another collection.

         */





    }
}
