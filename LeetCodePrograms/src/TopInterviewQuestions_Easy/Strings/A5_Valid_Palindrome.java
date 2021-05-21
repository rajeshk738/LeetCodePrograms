package TopInterviewQuestions_Easy.Strings;

class Solution5 {
    public boolean isPalindrome(String s) {
		
    	s = s.replaceAll("[^a-zA-Z0-9]+", ""); 
    	s = s.toLowerCase();
    	
    	int i=0, j = s.length() - 1;
    	
    	while(i!=j) {
    		
    		if(s.charAt(i) != s.charAt(j))
    			return false;
    		
    		i++; j--;
    	}
    	
    	
    	return true;
        
    }
}

public class A5_Valid_Palindrome {

	public static void main(String[] args) {
		
		Solution5 s = new Solution5();
		String str = "A man, a plan, a canal: Panama";
		
		System.out.println(s.isPalindrome(str));

	}

}
