package TopInterviewQuestions_Easy.Design;

import java.util.Stack;

class MinStack {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min_stack = new Stack<Integer>();
    
    public MinStack(){
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(min_stack.isEmpty() || val <= min_stack.peek()) {
        	min_stack.push(val);
        }
    }
    
    public void pop() {
        
       if(stack.isEmpty())
    	   return;
        
        if(stack.peek().equals(min_stack.peek()))
            min_stack.pop();
        
    	stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
		return min_stack.peek(); 
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

public class A2_Min_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
