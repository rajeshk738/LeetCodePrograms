package TopInterviewQuestions_Easy.Array;

class Solution11 {
    public void rotate(int[][] matrix) {
        
    	//transpose matrix
    	for(int i=0; i<matrix.length; i++) {
    		for(int j=0; j<matrix[0].length; j++) {
    			
    			if(i != j && i < j) {
    				int temp = matrix[i][j];
    				matrix[i][j] = matrix[j][i];
    				matrix[j][i] = temp;
    			}
    			
    		}
    	}
    	

    	// flip horizontally
    	int i = 0;
    	int j = matrix.length - 1;
    	
    	while(i < j) {
    		
    		for(int k=0; k<matrix.length; k++) {
    			
    			int temp = matrix[k][i];
    			matrix[k][i] = matrix[k][j];
    			matrix[k][j] = temp;
    		}
    		
    		i++;
    		j--;
    	}
    	
    	
    }
}


public class A11_Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		
		//int[][] matrix = {{1,2},{3,4}};
		
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print("\t"+ matrix[i][j]);
			}
			System.out.println();
		}
		
		Solution11 s = new Solution11();
		
		s.rotate(matrix);
		
		System.out.println("\n\n");
		
		for(int i1=0; i1<matrix.length;i1++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print("\t"+ matrix[i1][j]);
			}
			System.out.println();
		}
		
	}

}
