package bowling;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Before;
import org.junit.Test;


public class GameTest {

	private Game game;
	
	@Before
	public void setUp() {
		game = new Game();
	}

	
	@Test
	public void MakeGutterGameTest() {
		game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertThat(game.score(), is(0));
	}

	
	@Test
	public void MakeScoreOfOnes() {
		game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
		assertThat(game.score(), is(20));
	}

	/*User story 6 START, recgognize spare and game with spare*/
	@Test
	public void MakeSpareTest() {
		game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertThat(game.score(), is(16));
	}
	
	@Test
	public void MakeGameWithSpare() {
		game.roll(1,9, 3,6, 7,2, 3,6, 4,4, 5,3, 3,3, 4,5, 8,1, 2,6);
		assertThat(game.score(), is(88));
	}
	/*User story 6 END*/
	
}
