package dataTypeConverstions;

import java.util.ArrayList;
import java.util.List;

public class DataType_learning {

    public void intToLong(){
        int[] arr={1,44,5,7,77};

        List<Long> myLongLst=new ArrayList<>();

        for(int x:arr){
            myLongLst.add(Long.valueOf(x)); //Long.valueof(int)
        }
        System.out.println(myLongLst);
    }

    public static void main(String[] arg){
        DataType_learning obj=new DataType_learning();
        obj.intToLong();
    }


}
