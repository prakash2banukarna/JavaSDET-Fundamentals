package leetcode;
// prakash solved it
// https://leetcode.com/problems/minimum-moves-to-convert-string/description/
public class MinimumMovesToConvertString {
    public int minimumMoves(String s) {
//s = "XXOX"

        int count=0;
        for(int i=0;i<s.length();){
            if(!s.substring(i,i+1).equals("O")){
                /*
                First i implemented the below loops ,
                then thought above the edge case where the first character is 'O',
                then added the above if condition and started the index i+1
                 */


                if(i+3<=s.length() && s.substring(i,i+3).contains("X")){ // begin to defined end
//                s.substring(i,i+3).contains("X"); // i + 3 => 4 (excluded)
                    count++;
                }
                else if(i+3>s.length() && s.substring(i).contains("X")) // begin to end
                {
                    count++;
                }
                i+=3;
            }
            else{
                i++;
            }


        }

        return count;

    }

    public static void main(String[] arg){
//        String s = "XXOX";
//        String s = "XXX";
        String s = "OXOX";
        MinimumMovesToConvertString obj =new MinimumMovesToConvertString();
        obj.minimumMoves(s);
    }
}
