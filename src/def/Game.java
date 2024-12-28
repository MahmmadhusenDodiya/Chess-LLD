package def;

import java.util.ArrayList;
import java.util.List;

public class Game {
         
	Player p1,p2;
	Board board;
	List<Move> movesList;
	
	public Game(Player p1,Player p2) {

		// Player Initalization
		this.p1=p1;
		this.p2=p2;
		
		board=new Board();
		board.printBoard();
		
		movesList=new ArrayList<>();
		
		
	}

	public void move(Player p1, int i, int j, int k, int l) {
		
		Piece piece=board.board[i][j].getPiece();
		Piece killedPiece=board.board[k][l].getPiece();
		Move move=new Move(p1,i,j,k,l,killedPiece);
		movesList.add(move);
		board.board[i][j].setPiece(null);
		board.board[k][l].setPiece(piece);
		
		
		board.printBoard();
	}

	public void undo(Player p12) {
		
		Move move=movesList.get(movesList.size()-1);
		movesList.remove(movesList.size()-1);
		
		int i=move.i;
		int j=move.j;
		int k=move.k;
		int l=move.l;
		Piece killedPiece=move.killedPiece;
		Piece currentPiece=board.board[k][l].getPiece();
		
		
		board.board[i][j].setPiece(currentPiece);
		board.board[k][l].setPiece(killedPiece);
		
		
		
		
		board.printBoard();
	}
	
			// 
}
