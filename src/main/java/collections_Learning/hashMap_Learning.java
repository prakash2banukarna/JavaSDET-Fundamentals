package collections_Learning;

/*
In Java, a HashMap is a data structure that stores key–value pairs and lets you quickly look up a value if you know its key.
Keys must be unique, but values can be duplicated.
It does not guarantee any ordering of keys; iteration order can be different from insertion order.


Basic syntax
Import and create:

import java.util.HashMap;
HashMap<String, Integer> map = new HashMap<>();

Common methods:

put(K key, V value) – insert or update a mapping.

V get(Object key) – get value for a key, or null if missing.

remove(Object key) – delete an entry by key.

containsKey(key) / containsValue(value) – membership checks.

size(), isEmpty(), clear() – basic collection utilities.




 */

import java.util.HashMap;
import java.util.Map;

public class hashMap_Learning {

    public static void main(String[] arg){
        HashMap<String, Double> myMap= new HashMap<>();
        Map<String, Integer> myMap2= new HashMap<>();

        myMap.put("Prakash",32.0);
        myMap.put("Rudhran",9.00);
        myMap.put("Good",98.00);
        myMap.put("bad",7.0);

        System.out.println("This is how myMap looks " +myMap); //{Rudhran=9.0, bad=7.0, Good=98.0, Prakash=32.0}
        System.out.println("Get both key and values " +myMap.entrySet()); //[Rudhran=9.0, bad=7.0, Good=98.0, Prakash=32.0]
        System.out.println(" myMap Size " +myMap.size());

        //Remove - using key
        myMap.remove("bad");

        //Fetch the value using key
        double x = myMap.get("Rudhran");
        System.out.println("fetched double value: " +x);

        //Getting all the keys from hapMap
        System.out.println("All the keys :" +myMap.keySet()); // [Rudhran, Good, Prakash]

        //Getting all the values from hapMap
        System.out.println("All the Values :" +myMap.values()); // [9.0, 98.0, 32.0]


        //How to iterate using keySet
        for(String myKeyOneByOne: myMap.keySet()){
            System.out.println(myKeyOneByOne +":" +myMap.get(myKeyOneByOne));
        }

        //How to iterate using EntrySet
        for(Map.Entry<String,Double> e:myMap.entrySet()){
            String key = e.getKey(); // access key
            Double value =e.getValue(); // access value
            System.out.println(key + " -> " + value);
        }
    }
}
