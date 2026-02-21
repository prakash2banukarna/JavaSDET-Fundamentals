package collections_Learning;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Learning2 {

    public void compareTwoSets(){
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3));
        Set<Integer> set2 = new HashSet<>(List.of(2,3,1,1));

        if(set1.equals(set2)){
            System.out.println("Yes both the set values are same");
        }

    }

    public static void main(String[] arg){
        Set_Learning2 obj= new Set_Learning2();
        obj.compareTwoSets();
    }
}
