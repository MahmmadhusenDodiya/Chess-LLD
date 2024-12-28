package def;

public class Spot {
	private Piece piece;
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	public Piece getPiece() {
		return piece;
	}
	
	public void printPiece() {
		if(piece==null)
		System.out.print("       ");
		else {
			System.out.print(" "+piece.symbol()+" ");
		}
	}
	
}
