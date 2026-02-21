package leetcode;
// Prakash solved it
// https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/

public class FindMaxStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
//words = ["cd","ac","dc","ca","zz"]
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j< words.length;j++){
                String temp= new StringBuilder(words[j]).reverse().toString();
                if(words[i].equals(temp)){
                    count++;
                }

            }
        }

        System.out.println(count);
        return count;


    }

    public static void main(String[] arg){
        String[] words = {"cd","ac","dc","ca","zz"};
        FindMaxStringPairs obj=new FindMaxStringPairs();
        obj.maximumNumberOfStringPairs(words);
    }
}
