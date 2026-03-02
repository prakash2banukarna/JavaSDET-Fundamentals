package leetcode;

public class SubStringMatchingPatern_NotCompleted {
    public void hasMatch(String s, String p) {
// s = "leetcode", p = "ee*e"

        String prefixString="";
        String suffixString="";

        String[] pArr=p.split("");

        for(int i=0;i<pArr.length;i++){
            if(pArr[i].equals("*")){
                prefixString=p.substring(0,i);
                suffixString=p.substring(i+1);
                break;
            }
        }
        System.out.println(prefixString);
        System.out.println(suffixString);
    }

    public static void main(String[] arg){
        String s = "leetcode";
        String p = "ee*e";
//        String s = "luck";
//        String p = "u*";

        SubStringMatchingPatern_NotCompleted obj=new SubStringMatchingPatern_NotCompleted();
        obj.hasMatch(s,p);
    }
}
