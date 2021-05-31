package TopInterviewQuestions_Easy.Others;

class Solution3 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse_number = 0;
        int mask = 1;
        int last_digit = 0;
        
        for(int i=0; i<32; i++){
            reverse_number <<= 1;
            last_digit = n & mask;
            
            if(last_digit != 0){
                reverse_number = reverse_number + 1;
            }
            n = n >> 1;
        }
        
        return reverse_number;
    }
}


public class A3_Reverse_Bits {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int n = 00100; n = s.reverseBits(n);
		System.out.println(n);

	}

}
