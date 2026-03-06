package collections_Learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Array_to_List {
    public static void main(String[] arg){
        int[] arr = {2, 3, 4, 7, 11};
        List<Integer> lst= Arrays.stream(arr).boxed().toList();
        System.out.println(lst); // Output: [2, 3, 4, 7, 11]
    }
}
