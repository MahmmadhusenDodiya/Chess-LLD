package def;

public abstract class Piece {
	Boolean isBlack;
	Boolean isKilled;
	public Piece(boolean isKilled,boolean isBlack) {
		this.isBlack=isBlack;
		this.isKilled=isKilled;
	}
	public abstract String symbol();
	public abstract boolean canMove(Board b,Spot start,Spot end);
	public abstract void move(Board b,Spot start,Spot end);
}
