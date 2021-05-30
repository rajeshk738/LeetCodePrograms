package TopInterviewQuestions_Easy.Math;

class Solution3 {
    public boolean isPowerOfThree(int n) {
        
        if(n <= 0)
        	return false;
        
        int max_pow_val =  (int) (Math.log10(Integer.MAX_VALUE) / Math.log10(3));
       // System.out.println(max_pow_val);
        max_pow_val = (int) Math.pow(3, max_pow_val);
       // System.out.println(max_pow_val);
        if(max_pow_val % n == 0)
        	return true;
        
        return false;
    }
}


public class A3_Power_of_Three {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.isPowerOfThree(2));

	}

}
