package TopInterviewQuestions_Easy.Strings;

class Solution7 {
	    public int strStr(String haystack, String needle) {
	        
	    	if(needle.length() ==  haystack.length()){
	            if(haystack.equals(needle))
	                return 0;
	            else 
	                return -1;
	        }
	        
	        if(haystack.length() == 0)
	            return -1;
	    	
	    	if(needle.length() > haystack.length())
	    		return -1;
	    	
	    	int needle_len = needle.length();
	    	
	    	for(int i = needle_len; i <= haystack.length(); i++) {
	    		if(haystack.substring(i-needle_len, i).equals(needle))
	    			return i-needle_len;
	    		System.out.println(haystack.substring(i-needle_len, i));
	    	}
	    	
	    	return -1;
	    }
	}

public class A7_Implement_strStr {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		String haystack = "abc";
		String needle = "c";
		System.out.println(s.strStr(haystack, needle));

	}

}
