package n3exercici_Tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import n3exercici5.Player;

public class Tests_n3exercici5 {

	Player players = new Player();
	
	@Test
	public void test_Map() {
		
		Map<Integer, String >playersMap = players.fillMap();
	
		Assertions.assertThat(playersMap).as("This Map doesnt cointain this key").containsKeys(4);
		Assertions.assertThat(playersMap).as("This Map doesnt cointain this key").containsKeys(7);
		
	}
	
	
}
