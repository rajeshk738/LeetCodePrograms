package TopInterviewQuestions_Easy.Others;

import java.util.Stack;

class Solution5 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        try {
        for(char c: s.toCharArray()) {
        	if(c == '(' || c == '{' || c == '[') {
        		stack.push(c);
        	}
        	else if(c == ')' && stack.peek() == '(' && !stack.isEmpty()) {
        		stack.pop();
        	}
        	else if(c == '}' && stack.peek() == '{' && !stack.isEmpty()) {
        		stack.pop();
        	}
        	else if(c == ']' && stack.peek() == '[' && !stack.isEmpty()) {
        		stack.pop();
        	}
        	else
        		return false;
        }
        }
        catch(Exception e) {
        	return false;
        }
        return stack.isEmpty();
    }
}

public class A5_Valid_Parentheses {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		String str = "()[]}";
		System.out.println(s.isValid(str));
	}

}
