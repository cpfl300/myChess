package myChess;

public class pawnTest extends junit.framework.TestCase{
	public void testCreate(){
		Pawn pawn = new Pawn();
		String pawnColor = pawn.getColor();
		assertEquals("white", pawnColor);
		
		Pawn secondPawn = new Pawn("black");
		String secondPawnColor = secondPawn.getColor();
		assertEquals("black", secondPawnColor);
		
	}
}
