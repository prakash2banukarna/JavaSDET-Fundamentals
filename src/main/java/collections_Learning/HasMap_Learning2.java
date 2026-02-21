package collections_Learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HasMap_Learning2 {

    public void StringCount(){
        String myName="Messiiii";
        String[] myNameArr=myName.split("");
        Map<String,Long> strCount= Arrays.stream(myNameArr).
                collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println("My name count is : " +strCount);

    }

    public void HardCodedMapValue(){
        Map<String, Integer> variableVal = Map.of(
                "++X", 1,
                "X++", 1,
                "--X", 1,
                "X--", 1
        );
    }

    public void IntegerCount_Solution2(){
        int[] nums = {1,2,3,1,1,3};

        Map<Integer,Integer> intCount= new HashMap();
        for(int num:nums){
            /*
            intCount.get(key) returns the value, if the key is not presnet then use below
            if the value is not present then default to 0
             */

            int count=intCount.getOrDefault(num,0);
            intCount.put(num,count+1);
        }
        System.out.println("My integer count : " +intCount);
    }

    public void IntegerCount(){
        int[] arr = {1, 2, 2, 1, 1, 3};
        //Box the ints to Integers.
        Map<Integer,Long> intCount=Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println("My int counts _Solution 2 is :" +intCount);
    }

    public void ascendingOrderKeys(){ //Order the map using ascending order
        Map<Integer,String> ageMap= new HashMap<>(Map.of(35,"Prakash",
                7,"Rudhran",31,"Kannamma",6,"Ansh"));
        System.out.println("Hash map before sorting :" + ageMap);

        Map<Integer,String> ageMapAscendingOrder= new TreeMap<>(ageMap);
        System.out.println("Hash map After sorting :" + ageMapAscendingOrder);

    }

    public static void main(String[] a){
        HasMap_Learning2 obj=new HasMap_Learning2();
//        obj.StringCount();
//        obj.IntegerCount();
//        obj.IntegerCount_Solution2();
        obj.ascendingOrderKeys();
    }
}
