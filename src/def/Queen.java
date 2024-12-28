package def;

public class Queen extends Piece{

	public Queen(boolean isKilled, boolean isBlack) {
		super(isKilled, isBlack);
		// TODO Auto-generated constructor stub
	}

	public boolean canMove(Board b, Spot start, Spot end) {
		// TODO Auto-generated method stub
		return false;
	}

	public void move(Board b, Spot start, Spot end) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String symbol() {
		return ((isBlack)?"B":"W")+"-QUN";
	}
	

}
