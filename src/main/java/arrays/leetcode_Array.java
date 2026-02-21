package arrays;

import java.util.*;
import java.util.stream.Collectors;

public class leetcode_Array {

    public void StringToArray(){
        String i="Messi";
        String[] s=i.toLowerCase().split("");
        System.out.println(Arrays.toString(s));
    }

    public void ListOfStringToArray(){
        // Convert list to array
        List<String> myLst = List.of("Messi","Ronal","Neymar","Rudhran");
        String[] myStrArray = new String[myLst.size()];

        int index=0;
        for(String x:myLst){
            myStrArray[index]=x;
            index++;
        }
        System.out.println("Converted List to Arrays: " +Arrays.toString(myStrArray));

    }

    public void ListOfList(){
        List<List<Integer>> nestedLst = new ArrayList<>();
        int[]  arr = {4,2,1,3};
        for(int i=0;i< arr.length-1;i++){
            List<Integer> lst=new ArrayList();
            lst.add(arr[i]);
            lst.add(arr[i+1]);
            nestedLst.add(lst); //  [[4, 2], [2, 1], [1, 3]]
        }
        System.out.println("Nestesd list : " +nestedLst);
    }

    //Array fill
    public void arrFill(){
        int[] myArr=new int[5];
        Arrays.fill(myArr,9);
        System.out.println(Arrays.toString(myArr)); // outputs : [9, 9, 9, 9, 9]
        System.out.println(Integer.MAX_VALUE); // this will return max value in int
    }

    //How to compare if two arrays are having exactly same values and lenght
    public boolean isArraysEqual(){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean equal = Arrays.equals(arr1, arr2);
        System.out.println(equal);  // true
        return equal;
    }

    //How to compare if two arrays are having exactly same values and lenght
    public static boolean areEqual(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

//To count the occurrences of each string in the array
    public void StringCount() {
        String[] arr = {"k","s", "f","k", "g", "s","k"};

        Map<String,Long> stringCounts=Arrays.stream(arr).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println("stringCounts :" +stringCounts);

    }

    public static void main(String[] arg){
        leetcode_Array obj=new leetcode_Array();
//        obj.StringToArray();
//        obj.ListOfStringToArray();
//        obj.ListOfList();
//        obj.arrFill();
//        obj.isArraysEqual();
        obj.StringCount();
    }
}
