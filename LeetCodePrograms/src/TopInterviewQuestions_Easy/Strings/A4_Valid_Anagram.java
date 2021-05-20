package TopInterviewQuestions_Easy.Strings;

class Solution4 {
    public boolean isAnagram(String s, String t) {
		
    	//s = s.toLowerCase();
    	//t = t.toLowerCase();
    	
    	if(s.length() == t.length()) {
    		
    		int counts[] = new int[26];
    		
    		for(int i=0; i<s.length(); i++) {
    			counts[s.charAt(i) - 'a']++;
    			counts[t.charAt(i) - 'a']--;
    		}
    		
    		for(int c:counts) {
    			if(c != 0 )
    				return false;
    		}
    		
    		return true;
    	}
    
    	
    	return false;
        
    }
}

public class A4_Valid_Anagram {

	public static void main(String[] args) {
		
		Solution4 s = new Solution4();
		String str1 = "rajesh";
		String str2 = "hsejra";
		System.out.println(s.isAnagram(str1, str2));

	}

}
