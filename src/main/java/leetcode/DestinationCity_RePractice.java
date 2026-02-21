package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Prakash solved it - Have to retry as you took lot of time to solve it
// https://leetcode.com/problems/destination-city/description/

public class DestinationCity_RePractice {
    public String destCity(List<List<String>> paths) {

        int rowLen=paths.size();
        List<String> destinationCity= new ArrayList<String>();

        for(int i=0;i<rowLen;i++){
            destinationCity.add(paths.get(i).get(0));
        }

        System.out.println(destinationCity);

        for(int y=0;y<rowLen;y++){
            if(!destinationCity.contains(paths.get(y).get(1))){
                System.out.println(paths.get(y).get(1));
                return paths.get(y).get(1);
            }
        }
        return "";

    }

    public static void main(String[] arg){
        List<List<String>> paths=  Arrays.asList(
                Arrays.asList("London", "New York"),
                Arrays.asList("New York", "Lima"),
                Arrays.asList("Lima", "Sao Paulo")
        );
        DestinationCity_RePractice obj=new DestinationCity_RePractice();
        obj.destCity(paths);
    }
}
