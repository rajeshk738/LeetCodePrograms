package TopInterviewQuestions_Easy.Strings;

class Solution2 {
    public int reverse(int x) {
		
    	if(x > -10 && x < 10)
    		return x;
    	
    	if(x > 0) {
    		
    		x = reverse_number(x);
    		return x;
    	}
    	else {
    		x = x * -1;
    		x = reverse_number(x);
    		x = x * -1;
    		return x;
    	}
        
    }

	private int reverse_number(int num) {
		
		int rev = 0;
		int rem = 0;
		
		while(num != 0) {
			rem = num % 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		
		return rev;
	}
    
}


public class A2_Reverse_Integer {

	public static void main(String[] args) {
		
		Solution2 s = new Solution2();
		
		int x = 1534236469;
		System.out.println(x);
		x = s.reverse(x);
		
		System.out.println(x);

	}

}
