package leetcode;

public class MaximumRepeatSub_Not_Completed {
    public int maxRepeating(String sequence, String word) {
//sequence = "ababc", word = "ab"
        int wordLen=word.length();
        if(!sequence.contains(word)){
            return 0;
        }

        int repeatCount=0;
        char start=word.charAt(0);
        for(int i=0;i<sequence.length();){
            if(sequence.charAt(i)==start){
                String temp=sequence.substring(i,i+wordLen);
                if(temp.equals(word)){
                    repeatCount++; // once repeat is found , increment
                    i+=wordLen; //Increase by word length ,so next iteration checks
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }

        }
        System.out.println(repeatCount);
        return repeatCount;



    }

    public static void main(String[] arg){
        String sequence = "ababc";
        String word = "ba";
        MaximumRepeatSub_Not_Completed obj = new MaximumRepeatSub_Not_Completed();
        obj.maxRepeating(sequence,word);


    }


}
