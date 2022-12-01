package me.kafando;

public class TicTacToeGame {

    private char [][] tictactoeGameMatrix = new char[3][3];

    void play(char player, int row , int column){
        tictactoeGameMatrix[row][column] = player ;
    }


    char get_case_valeu(int row, int col){
        return tictactoeGameMatrix[row][col];
    }

    public char winner() {
		
		
		if(checkColumGetWinner() != 0) return checkColumGetWinner();
		if(checkRowGetWinner() != 0) return checkRowGetWinner();
		if(checkDiagonalsGetWinner() != 0) return checkDiagonalsGetWinner();
		
		return '-';
	}
	
	
	// test columns 
	// test diagonals 
	// test rows 
	

	
	private char checkColumGetWinner() {
		
		for(int col = 0; col < 3 ; col ++) {
			char firstRowValue = tictactoeGameMatrix[0][col];
			char secondRowValue = tictactoeGameMatrix[1][col];
			char thirdRowValue = tictactoeGameMatrix[2][col];
			
			if(firstRowValue != 0 && firstRowValue == secondRowValue && firstRowValue == thirdRowValue) 
				return firstRowValue;
		}
		
		
		
		return 0;
		
	}
	
	private char checkRowGetWinner() {
		
		for(int row = 0; row < 3 ; row ++) {
			char firstColumnValue = tictactoeGameMatrix[row][0];
			char secondColumnValue = tictactoeGameMatrix[row][1];
			char thirdColumnValue = tictactoeGameMatrix[row][2];
			
			if(firstColumnValue != 0 && firstColumnValue == secondColumnValue && firstColumnValue == thirdColumnValue) 
				return firstColumnValue;
			
		}
		return 0;
		
	}
	
	private char checkDiagonalsGetWinner() {
		System.err.println("hi diago");
		int index = 0;
		char firstDiagValue = tictactoeGameMatrix[index][index];
		char secondDiagValue = tictactoeGameMatrix[index+1][index+1];
		char thirdDiagValue = tictactoeGameMatrix[index+2][index+2];

		
		if(firstDiagValue != 0 && firstDiagValue == secondDiagValue && firstDiagValue == thirdDiagValue) 
		{
			return firstDiagValue;
		}

        index=0;
        firstDiagValue = tictactoeGameMatrix[index][index+2];
        secondDiagValue = tictactoeGameMatrix[index+1][index+1];
        thirdDiagValue = tictactoeGameMatrix[index+2][index];
        if(firstDiagValue != 0 && firstDiagValue == secondDiagValue && firstDiagValue == thirdDiagValue) 
		{
			return firstDiagValue;
		}
      
		
		return 0;
		
	}

    

}
