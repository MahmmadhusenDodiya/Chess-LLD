package def;

public class Board {
	Spot board[][];
	
	public Board() {
		
		// Initalize board & Put pieces
		board=new Spot[8][8];
		for(int i=0;i<8;i++) for(int j=0;j<8;j++) board[i][j]=new Spot();
		board[0][0].setPiece(new King(false,false));
		board[1][1].setPiece(new Pawn(false, true));
		board[4][4].setPiece(new King(false, true));
		
		
		
	}
	
	public void printBoard() {
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				board[i][j].printPiece();
				System.out.print("|");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------------------");
	}
	
}
