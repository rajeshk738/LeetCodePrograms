package TopInterviewQuestions_Easy.Strings;

import java.util.HashMap;

class Solution3 {
    public int firstUniqChar(String s) {
		
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	
    	int str_len = s.length();
    	
    	if(str_len == 1)
    		return 0;
    	
    	for(int i=0; i<str_len; i++) {
    		char c = s.charAt(i);
    		
    		if(map.containsKey(c)) {
    			int count = map.get(c);
    			map.put(c, count+1);
    		}
    		else {
    			map.put(c, 1);
    		}
    	}
    	
    	for(int i=0; i<str_len; i++) {
    		char c = s.charAt(i);
    		
    		if(map.get(c) == 1) {
    			return i;
    		}
    	}
    	
    	return -1;
        
    }
}

public class A3_First_Unique_Character_String {

	public static void main(String[] args) {
		
		Solution3 s = new Solution3();
		String str = "leetcodelove";
		System.out.println(s.firstUniqChar(str));

	}

}
