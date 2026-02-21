package leetcode;
// Prakash solved it
// https://leetcode.com/problems/goal-parser-interpretation/description/
public class GoalParserInterpretation {
    public String interpret(String command) {
//String command = "G()(al)";
        return command.replace("()","o").replace("(al)","al");
    }

    public static void main(String[] arg){
        String command = "G()(al)";
        GoalParserInterpretation obj = new GoalParserInterpretation();
        obj.interpret(command);

    }
}
