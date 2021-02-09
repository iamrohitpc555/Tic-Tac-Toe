package TicTacToe;

public class TicTacToe {
	public char board[] = new char[10];
	TicTacToe() {
        creatingBoard();
    }
	 public void creatingBoard() {
	        for (int i = 1; i < 10; i++) {
	            board[i] = ' ';
	        }
	    }
	public static void main(String[] args) {
		System.out.println("---------Welcome to TicTacToe Problem-----------");
		TicTacToe ticTacToeGame = new TicTacToe();
		ticTacToeGame.creatingBoard();

	}

}
