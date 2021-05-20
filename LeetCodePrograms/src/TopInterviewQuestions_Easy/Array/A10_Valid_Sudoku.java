package TopInterviewQuestions_Easy.Array;

import java.util.HashSet;

class Solution10 {
    public boolean isValidSudoku(char[][] board) {
		
    	HashSet<String> hs = new HashSet<String>();
    	
    	for(int i=0; i<9; i++) {
    		
    		for(int j=0; j<9; j++) {
    			char c = board[i][j];
    			
    			if(c != '.') {
    			if(!hs.add(board[i][j] + " row value " + i) || 
    			!hs.add(board[i][j] + " column value " + j) || 
    			!hs.add(board[i][j] + " 3 by 3 matrix value " + i/3 + " - " + j/3))
    				return false;
    			
    		}
    			
    		}
    	}
    	
    	return true;
	
        
    }
}

public class A10_Valid_Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution10 s = new Solution10();
		
		char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
		
		System.out.println(s.isValidSudoku(board));		
	}

}
