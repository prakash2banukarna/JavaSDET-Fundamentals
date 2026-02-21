package Streams_filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter_learning {
    public static void main(String[] a){
        List<Integer> nums= Arrays.asList(4,56,2,6,9,2,7,9);

        //Filter only even numbers
        List<Integer>  evenNums=nums.stream().
                filter(n-> (n%2==0))
                .collect(Collectors.toList());

        System.out.println("Even nums from the list :" +evenNums);

        //Filter Odd numbers - Print
        nums.stream().filter(n->n%2!=0).forEach(n-> System.out.println("Odd nums from the list "+n));

        List<String> names=Arrays.asList("Ronaldo","Messi","Rooney","HarryKane","JoriAlba","ViratKholi");
        //Filter >4 and <7
        List<String> bestPlayers=names.stream().filter(x->
                x.length() > 4 && x.length() < 7)
                .collect(Collectors.toList());

        System.out.println("players name length  >4 and <7 :" +bestPlayers);
        //Also this can be written as below
        names.stream().filter(x->
                        x.length() > 4 && x.length() < 7)
                .forEach(System.out::println);





    }

}
