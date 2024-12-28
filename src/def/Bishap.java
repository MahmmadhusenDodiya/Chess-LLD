package def;

public class Bishap extends Piece{

	public Bishap(boolean isKilled, boolean isBlack) {
		super(isKilled, isBlack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMove(Board b, Spot start, Spot end) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(Board b, Spot start, Spot end) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String symbol() {
		return ((isBlack)?"B":"W")+"-BIS";
	}

	

}
