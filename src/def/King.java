package def;

public class King extends Piece{

	
	public King(boolean isKilled, boolean isBlack) {
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
		return ((isBlack)?"B":"W")+"-KIN";
	}
}
