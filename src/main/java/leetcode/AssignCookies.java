package leetcode;

import java.util.Arrays;
// Prakash solved it - But time can be improved.

//https://leetcode.com/problems/assign-cookies/description/?envType=problem-list-v2&envId=array

/*
This solution is good.
https://leetcode.com/problems/assign-cookies/solutions/6829052/beats-9931-using-greedy-for-beginners-ja-s4b7/?envType=problem-list-v2&envId=array
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int output=0;
        int z=0;
        for(int i=0;i<s.length;i++){
            for(int j=z;j<g.length;j++){ // assigned value from z , so setting my own value (setting the index)
                if(s[i]>=g[j]){
                    output++;
                    z=j+1;
                    break;

                }
            }
        }
        System.out.println(output);
        return output;

    }

    public static void main(String[] arg){
//        int[] g = {1,2,3};
//        int[] s = {1,1};

//        int[] g = {1,2};
//        int[] s = {1,2,3};

        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        AssignCookies obj =new AssignCookies();
        obj.findContentChildren(g,s);

    }




}
