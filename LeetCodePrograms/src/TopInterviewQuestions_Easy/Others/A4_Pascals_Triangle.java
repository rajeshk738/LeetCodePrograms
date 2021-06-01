package TopInterviewQuestions_Easy.Others;

import java.util.ArrayList;
import java.util.List;

class Solution4 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
                
        for(int i=1; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> pre_row = triangle.get(i-1);
            row.add(1);
            
            for(int k=1; k < i; k++){
                row.add(pre_row.get(k-1) + pre_row.get(k));
            }
            
            row.add(1);
            
            triangle.add(row);

        }
        
        return triangle;
    }
}

public class A4_Pascals_Triangle {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int num_rows = 6;
		List<List<Integer>> ls = s.generate(num_rows);
		System.out.println(ls);
	}

}
