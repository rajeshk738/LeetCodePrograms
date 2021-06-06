package TopInterviewQuestions_Easy.Strings;

class Solution8 {
    public String countAndSay(int n) {
        
        String val = "1";
        if(n == 1)
            return val;
        
        for(int i = 0; i < n - 1; i++){            
            StringBuilder str = new StringBuilder();
            char c = val.charAt(0);
            int count = 1;
            
            for(int j = 1; j < val.length(); j++){
                
                if(val.charAt(j) != c){
                    str.append(count);
                    str.append(c);
                    count = 0;
                    c = val.charAt(j);
                }
                count++;                
            }
            
            str.append(count);
            str.append(c);
            
            val = str.toString();
        }
                
        return val;
    }
}

public class A8_Count_And_Say {

	public static void main(String[] args) {
		Solution8 s = new Solution8();
		int n = 5;
		String str = s.countAndSay(n);
		System.out.println(str);

	}

}
