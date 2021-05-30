package TopInterviewQuestions_Easy.Math;
import java.util.HashMap;

class Solution4 {
	public int romanToInt(String s) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        
    	int total = 0;
    	int i=0;
    	
    	while(i<s.length()) {
    		if((i+2 != s.length() + 1) && (map.get(s.substring(i, i+2)) != null)) {
    			total += map.get(s.substring(i, i+2));
    			i += 2;
    		}
    		else {
    			total += map.get(s.substring(i,i+1));
    			i++;
    		}
    	}
    	
    	return total;
    }
}

public class A4_Roman_to_Integer {

	public static void main(String[] args) {
		
		String roman = "III";
		Solution4 s = new Solution4();
		System.out.println("total : "+s.romanToInt(roman));
	}

}
