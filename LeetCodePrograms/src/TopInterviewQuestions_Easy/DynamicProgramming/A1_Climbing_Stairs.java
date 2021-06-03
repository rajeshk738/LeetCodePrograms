package TopInterviewQuestions_Easy.DynamicProgramming;

// using fibonaci series time: O(n) space : O(1)
class Solution1 {
    public int climbStairs(int n) {
    	if(n == 1)
    		return 1;
    	
        int first = 1; // one way if there is one step
        int second = 2; // two ways if there are two steps
    	
        for(int i=3; i <= n; i++) {
        	int third = second + first;
        	first = second;
        	second = third;
        }
        
        return second;
    }
}

// using dynamic programming
// time : O(n) space : O(n)
//class Solution1 {
//    public int climbStairs(int n) {
//    	if(n == 1)
//    		return 1;
//    	
//        int[] ways = new int[n+1];
//        ways[1] = 1;
//        ways[2] = 2;
//        
//        for(int i=3; i<=n; i++) {
//        	ways[i] = ways[i-2] + ways[i-1];
//        }
//        return ways[n];
//    }
//}


public class A1_Climbing_Stairs {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int n = 4;
		System.out.println(s.climbStairs(n));

	}

}
