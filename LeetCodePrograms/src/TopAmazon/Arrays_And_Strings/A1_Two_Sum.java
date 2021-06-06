package TopAmazon.Arrays_And_Strings;

import java.util.HashMap;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++) {
        	int val = target - nums[i];
        	if(map.containsKey(val)) {
        		return new int[] {map.get(val),i};
        	}
        	map.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }
}

public class A1_Two_Sum {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] a = s.twoSum(nums, target);
		
		for(int x: a) {
			System.out.println("\t "+ x);
		}

	}

}
