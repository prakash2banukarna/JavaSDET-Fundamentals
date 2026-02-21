package Stream_Maps;

import java.util.*;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] arg){
        List<String> vechiles= Arrays.asList("bus","car","lorry","cycle");
        List<String> upperCaseVech_8=new ArrayList<>();
        // Convert to upper case in java 8
        for(String vec:vechiles){
            upperCaseVech_8.add(vec.toUpperCase());
        }
        System.out.println("Vehicles in uppercase in Java 8:" +upperCaseVech_8);

        // Convert to upper case in Streams
        List<String> upperCaseVech = vechiles.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
        System.out.println("Vehicles in uppercase in Streams:" +upperCaseVech);
        
        // Find the length of each vechile's : HashMap
        Map<String,Integer> vechicleLen=vechiles.stream().collect(
                Collectors.toMap(v->v, v->v.length())
        );
        System.out.println("Length of each Vehicles :" +vechicleLen);

        for(Map.Entry<String,Integer> v :vechicleLen.entrySet()){
            System.out.println("Vehicle and length: " +v.getKey() +":"+ v.getValue() );

        }

    }
}
