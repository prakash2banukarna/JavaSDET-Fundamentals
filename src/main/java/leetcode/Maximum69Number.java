package leetcode;
// Prakash solved it
// https://leetcode.com/problems/maximum-69-number/description/
public class Maximum69Number {

    public int maximum69Number (int num) {
//int num = 9669;
        String[] str=String.valueOf(num).split("");
        for(int i=0;i<str.length;i++){
            if(str[i].equals("6")){
                str[i]="9";
                break; //This breaks further iterating.
            }
        }

        String myOutput="";
        for(int j=0;j<str.length;j++){
            myOutput=myOutput+str[j];
        }
        System.out.println(myOutput);
        return Integer.parseInt(myOutput);


    }

    public static void main(String[] arg){
        int num = 9669;
        Maximum69Number obj=new Maximum69Number();
        obj.maximum69Number(num);

    }
}
