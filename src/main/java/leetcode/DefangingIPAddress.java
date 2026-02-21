package leetcode;
//Prakash solved it
// https://leetcode.com/problems/defanging-an-ip-address/description/

/*
Loop through each char of string and check if its equal to the value and
 */
public class DefangingIPAddress {
    public String defangIPaddr(String address) {
//address = "1.1.1.1"
        String myOutput="";
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            if(String.valueOf(ch).equals(".")){
                myOutput=myOutput+"[.]";
            }
            else{
                myOutput=myOutput+ch;
            }
        }

        System.out.println(" :" +myOutput);
        return myOutput;

    }

    public static void main(String[] arg){
        String address = "1.1.1.1";
        DefangingIPAddress obj = new DefangingIPAddress();
        obj.defangIPaddr(address);
    }
}
