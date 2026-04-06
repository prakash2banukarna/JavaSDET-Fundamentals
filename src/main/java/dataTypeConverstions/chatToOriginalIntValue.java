package dataTypeConverstions;

public class chatToOriginalIntValue {

    public void charToInt(){
        char x='9';
        int c=x-'0';
        System.out.println(c);
    }


    public static void main(String[] arg){
        chatToOriginalIntValue obj =new chatToOriginalIntValue();
        obj.charToInt();
    }
}
