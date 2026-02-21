package interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findNumberStartingWith {

    public static void main(String[] arg){
        //Find all numbers starting with 1 using streams

//        List<Integer> numbers = Arrays.asList(18,33,55,66,12,612,157,1,9811,17);
        List<Integer> numbers = List.of(18,33,55,66,12,612,157,1,9811,17); // Or
        //List<Integer> startingWithOne=numbers.stream().filter(num->String.valueOf(num).startsWith(String.valueOf(1))).collect(Collectors.toList());
        List<Integer> startingWithOne=numbers.stream().filter(num->String.valueOf(num).startsWith("1")).collect(Collectors.toList());

        System.out.println(startingWithOne);
    }
}
