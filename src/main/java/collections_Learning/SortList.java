package collections_Learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] arg){
        List<Integer> list = Arrays.asList(5, 1, 4, 2, 3);

// Ascending (natural order)
        Collections.sort(list);  // [1, 2, 3, 4, 5]
        System.out.println(" Natural Order :" +list);

// Descending
        Collections.sort(list, Collections.reverseOrder());  // [5, 4, 3, 2, 1]
        System.out.println(" Descending Order :" +list);

        // Descending Option 2
        list.sort(Collections.reverseOrder());
        System.out.println(" Descending Order option 2 :" +list);
    }
}
