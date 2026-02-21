import java.util.*;
import java.util.stream.Collectors;

public class learnMaps {
    public static void main(String[] arg){
        System.out.println("Hey , you will get a job for sure, keep trying" );

        //String : Name-Place-Age-Gender
        List<String> familyData = List.of("Prakash-Barking-36-M","Rudhran-London-6-M",
                "Ammu-Arcot-32-F","Amma-Pandeswaram-52-F","Appa-Pandeswaram-55-M","Akka-Chennai-40-F",
                "AAthai-Pandeswaram-60-F","Aunty-Pandeswaram-62-F","Kannamma-Heart-32-F");

        //CASE : Get all Names ,should also contain duplicate if present
        List<String> items = familyData.stream().map(x->x.split("-")[0]).collect(Collectors.toList());
        System.out.println("Items which may also contain duplicates because of using List : " + items + " and its size " +items.size());

        //CASE : Get all Places in a list witho duplicates if present
        List<String> itemsWithDuplicates = familyData.stream().map(x->x.split("-")[1]).collect(Collectors.toList());
        System.out.println("Length of places all the places,duplicates are okay ,USE List: " + itemsWithDuplicates + " and its size " +itemsWithDuplicates.size());

        //CASE : Get all Places in a list without duplicates
        Set<String> itemsWithoutDuplicates = familyData.stream().map(x->x.split("-")[1]).collect(Collectors.toSet());
        System.out.println("Length of places, WITHOUT duplicates ,USE SET: " + itemsWithoutDuplicates + " and its size " +itemsWithoutDuplicates.size());

        //Scenario : Group by Gender and  collect the family data
        Map<String, List<String>> genderGrouping=familyData.stream()
                .collect(Collectors.groupingBy(gender->gender.split("-")[3]));
        System.out.println("Gender based grouping " +genderGrouping);

        //Scenario : Group by Gender and the collect only the names
        Map<String,List<String>> genderGroupingNames = familyData.stream()
                .collect
                        (
                        Collectors.groupingBy(gender->gender.split("-")[3],
                                Collectors.mapping(name->name.split("-")[0],
                                        Collectors.toList()
                                )
                        ));

        System.out.println("Grouping by gender and store only names" +genderGroupingNames);

//To count the occurrences of each string in the array
        String[] arr = {"s", "f", "g", "s"};
        Map<String, Long> freq=Arrays.stream(arr)
                .collect(Collectors.groupingBy(s->s,Collectors.counting()));

    }
}
