package interviewQuestions;

import java.util.List;

//Given a list of strings, find out these strings which starts with a number.

public class findStrStartsWithNum {
    public static void main(String[] arg){
        List<String> words= List.of("1apple","banana","2orange","avacado");

        List<String> strStartsWithNum = words.stream().filter(str->Character.isDigit(str.charAt(0))).toList();
        System.out.println(strStartsWithNum);
    }
}
