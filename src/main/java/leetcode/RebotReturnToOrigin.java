package leetcode;
// Prakash solved it
// https://leetcode.com/problems/robot-return-to-origin/description/?envType=problem-list-v2&envId=string


public class RebotReturnToOrigin {
    public boolean judgeCircle(String moves) {
//moves = "UD"
        int ud=0;
        int rl=0;

        for(int i=0;i<moves.length();i++){
            char temp=moves.charAt(i);
            if(temp=='U'){
                ud=ud+1;
            }
            else if(temp=='D'){
                ud=ud-1;
            }
            else if(temp=='R'){
                rl=rl+1;
            }
            else if(temp=='L'){
                rl=rl-1;
            }
        }

        if(ud ==0 & rl==0){
            return true;
        }
        else{
            return false;
        }

//        return true; //dummy return
    }

    public static void main(String[] arg){
        String moves = "LL";
        RebotReturnToOrigin obj = new RebotReturnToOrigin();
        obj.judgeCircle(moves);
    }

}
