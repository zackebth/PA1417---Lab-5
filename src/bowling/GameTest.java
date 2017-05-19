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
	/*User story 1 START*/
	@Test
	public void frameTest() {
		game.roll(2,4);
	}
	/*User story 1 END*/
	
	/*User story 2 START*/
	@Test
	public void frameScoreTest() {
		game.roll(2,6);
		assertThat(game.score(), is(8));
	}
	/*User story 2 END*/
	
	/*User story 3 START*/
	@Test
	public void gameFrameTest() {
		game.roll(1,5, 3,6, 7,2, 3,6, 4,4, 5,3, 3,3, 4,5, 8,1, 2,6);
	}
	/*User story 3 END*/
	
	/*User story 4 START*/
	@Test
	public void gameFrameScoreTest() {
		game.roll(1,5, 3,6, 7,2, 3,6, 4,4, 5,3, 3,3, 4,5, 8,1, 2,6);
		assertThat(game.score(), is(81));
	}
	/*User story 4 END*/
	
	/*User story 5 START*/
	@Test
	public void MakeStrikeTest() {
		game.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertThat(game.score(), is(22));
	}
	/*User story 5 END*/

	/*User story 6 START*/
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
	
	/*User story 7 START*/
	@Test
	public void StrikeAndSpareTest() {
		game.roll(10, 4,6, 7,2, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertThat(game.score(), is(46));
	}
	
	@Test
	public void StrikeAndSpareGameTest() {
		game.roll(10, 4,6, 7,2, 3,6, 4,4, 5,3, 3,3, 4,5, 8,1, 2,6);
		assertThat(game.score(), is(103));
	}
	/*User story 7 END*/
	
	/*User story 8 START*/
	@Test
	public void MultiStrikes() {
		game.roll(10, 10, 7,2, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertThat(game.score(), is(55));
	}
	
	@Test
	public void GameWithMultiStrike() {
		game.roll(10, 10, 7,2, 3,6, 4,4, 5,3, 3,3, 4,5, 8,1, 2,6);
		assertThat(game.score(), is(112));
	}
	/*User story 8 END*/
	
	/*User story 9 START*/
	@Test
	public void GameWithMultiSpares() {
		game.roll(8,2, 5,5, 7,2, 3,6, 4,4, 5,3, 3,3, 4,5, 8,1, 2,6);
	}
	/*User story 9 END*/
	
	/*User story 10 START*/
	@Test
	public void SpareLastFrameTest() {
		game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 2,8, 7);
		assertThat(game.score(), is(17));
	}
	
	@Test
	public void SpareLastFrameGameTest() {
		game.roll(1,5, 3,6, 7,2, 3,6, 4,4, 5,3, 3,3, 4,5, 8,1, 2,8, 7);
		assertThat(game.score(), is(90));
	}
	/*User story 10 END*/
	
	/*User story 11 START*/
	@Test
	public void StrikeLastFrameTest() {
		game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 10, 7,2);
		assertThat(game.score(), is(19));
	}
	
	@Test
	public void StrikeLastFrameGameTest() {
		game.roll(1,5, 3,6, 7,2, 3,6, 4,4, 5,3, 3,3, 4,5, 8,1, 10, 7,2);
		assertThat(game.score(), is(92));
	}
	
	/*User story 11 END*/
	
	/*User story 12 START*/
	@Test
	public void StrikeBonusTest() {
		game.roll(1,5, 3,6, 7,2, 3,6, 4,4, 5,3, 3,3, 4,5, 8,1, 2,8, 10);
		assertThat(game.score(), is(93));
	}
	/*User story 12 END*/

	/*User story 13 START*/
	@Test
	public void PerfectGameTest() {
		game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
		assertThat(game.score(), is(300));
	}
	/*User story 13 END*/
	
}
