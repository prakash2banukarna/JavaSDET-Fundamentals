package Streams_filters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] arg){
        List<Products> productList=new ArrayList<>();
        productList.add(new Products(12,"Messi",56000));
        productList.add(new Products(9,"Ronaldo",40000));
        productList.add(new Products(34,"Kane",20000));
        productList.add(new Products(4,"Neymar",10000));

        //Filter the salary greater than 20000
        List<Products> greaterSal=productList.stream()
                .filter(p->p.price>20000).collect(Collectors.toList());
        System.out.println("salary greater than 20000 " +greaterSal.size());

        // Simply print the names whoes salary greater than 20000
        productList.stream()
                .filter(p->p.price>20000)
                .forEach(p-> System.out.println("salary greater than 20000 players : " + p.price));

        // if i need to store the names in a string then we have to use Map

        List<String> playerNames=productList.stream()
                .filter(p->p.price>20000).map(p->p.name).collect(Collectors.toList());
        System.out.println("Names of players who's salary greater than 20000 players : " + playerNames);


    }
}
