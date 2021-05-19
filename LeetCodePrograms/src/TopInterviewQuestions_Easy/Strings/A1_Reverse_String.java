package TopInterviewQuestions_Easy.Strings;

class Solution1 {
    public void reverseString(char[] s) {
        
    	int i=0,j = s.length - 1;
    	
    	while(i <= j) {
    		
    		char k = s[i];
    		s[i] = s[j];
    		s[j] = k;
    		
    		i++;
    		j--;
    	}
    	
    }
}

public class A1_Reverse_String {

	public static void main(String[] args) {
		
		char s[] = {'H','e','l','l','o'};
		
		Solution1 s1 = new Solution1();
		s1.reverseString(s);
		
		System.out.println(s);

	}

}
