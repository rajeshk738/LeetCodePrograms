package TopInterviewQuestions_Easy.Others;

/*class Solution1 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int count = 0;
        while(n > 0){
        	count++;
            n &= (n-1);
        }
        return count;
    }
    
}*/

class Solution1 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int count = 0;
        int mask = 1;
        for(int i=0; i<32; i++) {
        	if((n & mask) != 0) {
        		count++;
        	}
        	
        	mask <<= 1;
        }
        return count;
    }
    
}

public class A1_Number_of_1_Bits {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		//int n = 11111111111111111111111111111101;
		int n = 00000000000000000000000000001011;
		System.out.println(s.hammingWeight(n));

	}

}
