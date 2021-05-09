package TopInterviewQuestions.Array;

class Solution7 {
	  public int[] plusOne(int[] digits) {
		    int n = digits.length;
		    
		    for(int i=n-1;i>=0;i--) {
		    	
		    	if(digits[i] < 9) {
		    		digits[i]++;
		    		return digits;
		    	}
		    	digits[i] = 0;
		    }
		    
		    int[] new_number = new int[n+1];
		    new_number[0] = 1;
		    return new_number;
}

}

public class A7_Plus_One {

	public static void main(String[] args) {
		
		Solution7 s = new Solution7();
		int[] digits = {9};
		
		digits = s.plusOne(digits);
	
		for(int i=0;i<digits.length;i++)
		System.out.print("\t"+digits[i]);

	}

}
