import java.util.Scanner;
public class TicTacToeGame{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	char[][] table = new char[3][3];

	for (int row = 0; row < table.length; row++){
		for(int column = 0; column < table.length; column++){

			table[row][column] = ' ';
}
}
	char player = 'x';
	boolean gameOver = false;
	
 	while(!gameOver){
		printtable(table);
		System.out.println("player " + player + " enter: ");
		int row = input.nextInt();
		int column = input.nextInt(); 

		if (table [row][column] == ' '){
			table[row][column] = player;
			gameOver = youWon(table, player);
			if(gameOver){
				Syste.out.println("player " + " you won");
}
				else {
				if (player == 'x'){
					player = 'o';
		
					}else {
					player = 'x';
}
} 
	 		else {
			System.out.println("invalid choice.Try again");	



	
	}
	}
	}

	public static boolean haveWon(char[][] table, char player){
		for (int row = 0; row < table.length; row++){
			if(table[row][0] == player && table[row][1] == player && table[row][2] == player){
				return true;
	if(table[0][0] == player && table[1][1] == player && table[2][2] == player){


	}
	if(table[0][2] == player && table[1][1] == player && table[2][0] == player){
	return true;
	}
	return false;
	}
	public static void printtable(char[][] table){
		for (int row = 0; row < table.length; row++){
			for(int column = 0; column < table[row].length; column++){
				System.out.print(board[row][column] + " ");
	}
			System.out.println();
}
}
}
