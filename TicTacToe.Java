package TicTacToe;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	 public char board[] = new char[10];
	 public char symbol1, symbol2;
	 public int player = 0;
	 public boolean play = true;
	 public static Scanner scanner = new Scanner(System.in);
	 public void creatingBoard() {
	        for (int i = 1; i < 10; i++) {
	            board[i] = ' ';
	        }
	    }
	 public void getUserInput(String symbol) {
	        if (symbol.equals("X")) {
	            symbol1 = 'X';
	            symbol2 = 'O';
	        } else if (symbol.equals("O")) {
	            symbol1 = 'O';
	            symbol2 = 'X';
	        } else {
	           
	        }
	    }
	 public void printingBoard() {
	        String horizPart = "+---+---+---+";
	        for (int i = 0; i < 3; i++) {
	            System.out.println(horizPart);
	            for (int j = 1; j < 4; j++) {
	                System.out.print("| " + board[i * 3 + j] + " ");
	            }
	            System.out.print("|\n");
	        }
	        System.out.print(horizPart);
	        System.out.print("\n");
	 }
	 public boolean makingMovement(int i, int player) {
	        if (board[i] == ' ') {
	            if (player == 0) {
	                System.out.println("Played by the System: ");
	                board[i] = symbol2;
	            } else {
	                System.out.println("Played by the Player:   ");
	                board[i] = symbol1;
	            }
	            printingBoard();
	            
	            return false;
	        } else {
	            return true;
	        }
	 }
	 public void tossingForFirstTurn(String toss) {
	        int i = (int) Math.round(Math.random()) % 2;
	        if ((i == 1 && toss.equals("H")) || (i == 0 && toss.equals("T"))) {
	            System.out.println("Congratulations! You've won the Toss.");
	            player = 1;
	        } else {
	            System.out.println("You've lost Toss. Computer plays first.");
	            player = 0;
	        }
	 }
	 public void checkWin() {
	        if ((board[1] == symbol1 && board[2] == symbol1 && board[3] == symbol1)) {
	            System.out.println("Player Wins!");
	            System.exit(0);
	        }
	        if ((board[4] == symbol1 && board[5] == symbol1 && board[6] == symbol1)) {
	            System.out.println("Player Wins!");
	            System.exit(0);
	        }
	        if ((board[7] == symbol1 && board[8] == symbol1 && board[9] == symbol1)) {
	            System.out.println("Player Wins!");
	            System.exit(0);
	        }
	        if ((board[1] == symbol1 && board[4] == symbol1 && board[7] == symbol1)) {
	            System.out.println("Player Wins!");
	            System.exit(0);
	        }
	        if ((board[2] == symbol1 && board[5] == symbol1 && board[8] == symbol1)) {
	            System.out.println("Player Wins!");
	            System.exit(0);
	        }
	        if ((board[3] == symbol1 && board[6] == symbol1 && board[9] == symbol1)) {
	            System.out.println("Player Wins!");
	            System.exit(0);
	        }
	        if ((board[1] == symbol1 && board[5] == symbol1 && board[9] == symbol1)) {
	            System.out.println("Player Wins!");
	            System.exit(0);
	        }
	        if ((board[3] == symbol1 && board[5] == symbol1 && board[7] == symbol1)) {
	            System.out.println("Player Wins!");
	            System.exit(0);
	        }
	        if ((board[1] == symbol2 && board[2] == symbol2 && board[3] == symbol2)) {
	            System.out.println("Player Lost!");
	            System.exit(0);
	        }
	        if ((board[4] == symbol2 && board[5] == symbol2 && board[6] == symbol2)) {
	            System.out.println("Player Lost!");
	            System.exit(0);
	        }
	        if ((board[7] == symbol2 && board[8] == symbol2 && board[9] == symbol2)) {
	            System.out.println("Player Lost!");
	            System.exit(0);
	        }
	        if ((board[1] == symbol2 && board[4] == symbol2 && board[7] == symbol2)) {
	            System.out.println("Player Lost!");
	            System.exit(0);
	        }
	        if ((board[2] == symbol2 && board[5] == symbol2 && board[8] == symbol2)) {
	            System.out.println("Player Lost!");
	            System.exit(0);
	        }
	        if ((board[3] == symbol2 && board[6] == symbol2 && board[9] == symbol2)) {
	            System.out.println("Player Lost!");
	            System.exit(0);
	        }
	        if ((board[1] == symbol2 && board[5] == symbol2 && board[9] == symbol2)) {
	            System.out.println("Player Lost!");
	            System.exit(0);
	        }
	        if ((board[3] == symbol2 && board[5] == symbol2 && board[7] == symbol2)) {
	            System.out.println("Player Lost!");
	            System.exit(0);
	        }
	    }

	 public void computerPlay() {
	        
	        while (makingMovement((int) (Math.random() * 8) + 1, 0)) {
	            System.out.println("");
	        }
	 }

	 public void playGame() {
	        int i;
	        for (i = 0; i < 9; i++) {
	            if (player == 0) {
	                computerPlay();
	                player = 1;
	            } else {
	                System.out.println("Select Position from 1 to 9 : ");
	                while (makingMovement(scanner.nextInt(), player)) {
	                    System.out.println("try with different position.");
	                }
	                player = 0;
	            }
	        }
	        if (i == 9) {
	            System.out.println("Game Draw!");
	            System.exit(0);
	        }
	 }


	 public static void main(String[] args) {
		System.out.println("---------Welcome to TicTacToe Problem-----------");
		TicTacToe ticTacToeGame = new TicTacToe();
		Scanner sc = new Scanner(System.in);
		ticTacToeGame.creatingBoard();
		System.out.println("Enter Toss H or T:");
        ticTacToeGame.tossingForFirstTurn(sc.next());
		System.out.println("Choose either O or X: ");
	    ticTacToeGame.getUserInput(sc.next());
	    ticTacToeGame.printingBoard();
	    ticTacToeGame.playGame();
	    
	}

}
