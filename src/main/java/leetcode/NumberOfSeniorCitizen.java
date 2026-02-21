package leetcode;
// prakash solved it
// https://leetcode.com/problems/number-of-senior-citizens/description/
public class NumberOfSeniorCitizen {
    public int countSeniors(String[] details) {
//String[] ["7868190130M7522","5303914400F9211","9273338290F4010"];
        int myoutput=0;
        for(int i=0;i< details.length;i++){
            int age=Integer.parseInt(details[i].substring(11,13));
            if(age>60){
                myoutput++;
            }
        }

        System.out.println(myoutput);
        return myoutput;
     }

     public static void main(String[] arg){
         String[] details={"7868190130M7522","5303914400F9211","9273338290F4010"};
         NumberOfSeniorCitizen obj =new NumberOfSeniorCitizen();
         obj.countSeniors(details);
     }

}
