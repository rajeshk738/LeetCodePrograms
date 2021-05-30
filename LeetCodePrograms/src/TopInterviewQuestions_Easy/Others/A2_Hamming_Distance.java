package TopInterviewQuestions_Easy.Others;

class Solution2 {
    public int hammingDistance(int x, int y) {
        
        int count = 0;
        int n = x ^ y;
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

public class A2_Hamming_Distance {

	public static void main(String[] args) {
		int x = 1, y = 4;
		
		Solution2 s = new Solution2();
		System.out.println(s.hammingDistance(x, y));

	}

}
