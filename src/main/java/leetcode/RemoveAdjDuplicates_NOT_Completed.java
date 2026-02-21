package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAdjDuplicates_NOT_Completed {
    public String removeDuplicates(String s) {
        String[] str=s.split(""); // converting into arrays
        List<String> strList = new ArrayList<>(Arrays.asList(str)); // passing string of arrays into list

        for(int i=0;i<strList.size();i++){
//            if(strList.get(i) != strList.get(i + 1)){
            if(!strList.get(i).equals(strList.get(i + 1))){
                i++;
            }
            else{
                strList.remove(i);
                strList.remove(i+1);
            }
            System.out.println(strList);
        }
        return "r";

    }

    public static void main(String[] arg){
        String s="abbaca";
        RemoveAdjDuplicates_NOT_Completed obj= new RemoveAdjDuplicates_NOT_Completed();
        obj.removeDuplicates(s);

    }
}
