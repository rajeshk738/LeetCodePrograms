package TopInterviewQuestions_Easy.Math;


import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public List<String> fizzBuzz(int n) {
        
        ArrayList<String> al = new ArrayList<String>();
        
        int i = 0;
        
        while(i < n){
            int res = i + 1;
            if((res % 3) == 0 && (res % 5) == 0){
                al.add("FizzBuzz");
            }
            else if((res % 3) == 0){
                al.add("Fizz");
            }
            else if((res % 5) == 0){
                al.add("Buzz");
            }
            else{
                al.add(Integer.toString(res));
            }
            
            i++;
        }
        
        return al;
    }
}

public class A1_Fizz_Buzz {

	public static void main(String[] args) {
			
		int n = 15;
		
		Solution1 s = new Solution1();
		List<String> ls = s.fizzBuzz(n);
		
		System.out.println(ls);

	}

}
