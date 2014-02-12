package myChess;

public class pawnTest extends junit.framework.TestCase{
	public void testCreate(){
		final String wPawnColor = "white";
		final String bPawnColor = "black";		
		
		Pawn pawn = new Pawn(wPawnColor);
		String pawnColor = pawn.getColor();
		assertEquals("white", pawnColor);
		
		Pawn secondPawn = new Pawn(bPawnColor);
		String secondPawnColor = secondPawn.getColor();
		assertEquals("black", secondPawnColor);
		
	}
}
