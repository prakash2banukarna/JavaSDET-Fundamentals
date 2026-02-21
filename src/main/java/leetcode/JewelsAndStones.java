package leetcode;
// Prakash solved it
// https://leetcode.com/problems/jewels-and-stones/description/
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
//jewels = "aA", stones = "aAAbbbb"
        int output=0;

        for(int i=0;i<stones.length();i++){
            char ch = stones.charAt(i);
            if(jewels.contains(String.valueOf(ch))){
                output++;
            }
        }

        System.out.println(output);
        return output;
    }

    public static void main(String[] arg){
        String jewels = "aA";
        String stones = "aAAbbbb";
        JewelsAndStones obj=new JewelsAndStones();
        obj.numJewelsInStones(jewels,stones);

    }
}
