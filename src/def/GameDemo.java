package def;

public class GameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Player p1=new Player("Mahmmadhusen");  // White
			Player p2=new Player("Tahera");  // Black
			
			Game game=new Game(p1,p2);
			game.move(p1,0,0,1,1);
			
			game.undo(p1);
			
			
			
			
			
			
	}

}
