package TopInterviewQuestions_Easy.Design;

import java.util.Random;

class Solution1 {
    
    int[] original_array;
    int[] current_array;
    Random random = new Random();
    
    public Solution(int[] nums) {
        original_array = nums;
        current_array = nums.clone();

    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        current_array = original_array;
        original_array = original_array.clone();
        return current_array;
       
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        
        for(int i= 0; i < current_array.length; i++){
            
            int j = random.nextInt(current_array.length - i) + i;
            
            int temp = current_array[j];
            current_array[j] = current_array[i];
            current_array[i] = temp;
            
        }
        return current_array;
    }
}

public class A1_Shuffle_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
