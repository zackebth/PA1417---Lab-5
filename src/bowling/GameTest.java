package bowling;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void MakeRollBallTest() {
		Game game = new Game();
		game.roll(0);
	}
	
	@Test
	public void MakeGutterGameTest() {
		Game game = new Game();
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertEquals(0, game.score());
	}

	
	@Test
	public void MakeScoreOfOnes() {
		Game game = new Game();
		for (int i = 0; i < 20; i++) {
			game.roll(1);
		}
		assertEquals(20, game.score());
	}
}
