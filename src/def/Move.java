package def;

public class Move {
	Player player;
	int i,j,k,l;
	Piece killedPiece;
	
	public Move(Player player,int i,int j,int k,int l,Piece killedPiece) {
		// TODO Auto-generated constructor stub
		this.player=player;
		this.l=l;
		this.k=k;
		this.i=i;
		this.j=j;
		this.killedPiece=killedPiece;
	}	
}
