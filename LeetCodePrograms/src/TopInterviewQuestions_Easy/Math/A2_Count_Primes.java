package TopInterviewQuestions_Easy.Math;

class Solution2 {
    public int countPrimes(int n) {
        
        boolean[] primes  = new boolean[n];
        
        for(int i=2; i * i < primes.length; i++){
            for(int j=i; i * j < primes.length; j++){
                if(primes[i * j] == false)
                    primes[i * j] = true;
            }

     }
        
        
        
        int count = 0;
        for(int i=2; i<primes.length; i++){
            if(primes[i] == false)
                count++;
        }
        return count;
    }
}

public class A2_Count_Primes {

	public static void main(String[] args) {
		
		Solution2 s = new Solution2();
		int n = 1000;
		int no_primes = s.countPrimes(n);
		
		System.out.println(no_primes);

	}

}
