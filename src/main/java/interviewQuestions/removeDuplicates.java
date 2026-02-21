package interviewQuestions;

import java.util.Arrays;
import java.util.List;

// Reference : https://www.youtube.com/watch?v=tT3gUj6cq2U&t=985s
public class removeDuplicates {


    /*
    Question 1: Remove duplicates from the list and preserve the order using java
     */

    public static void main(String[] arg){
        List<String> lst= Arrays.asList("apple","banan","apple","orange");
        List<String> withoutDuplicateslst = lst.stream().distinct().toList(); //Using Distinct
//        Set<String> withoutDuplicateslst = lst.stream().collect(Collectors.toSet()); //Using Set but this will not preserve the order
//        System.out.println(withoutDuplicateslst);


        lst.stream().distinct().forEach(System.out::println);


    }


}
