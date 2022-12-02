package n3exercici5;

import java.util.HashMap;
import java.util.Map;

public class Player {

	Map<Integer, String> players = new HashMap<Integer, String>();
	
	public Map<Integer, String> fillMap(){
		
		players.put(1, "Chavez");
		players.put(2, "Tobio");
		players.put(3, "Ibanez");
		players.put(4, "Soto");
		players.put(5, "Pelado");
		players.put(6, "Merolla");
		return players;
		
	}
	
	
}
