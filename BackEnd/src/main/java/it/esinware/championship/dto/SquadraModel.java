package it.esinware.championship.dto;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;
import it.esinware.championship.domain.Player;

@Data
public class SquadraModel implements Serializable {

	private static final long serialVersionUID = 6054800629275827590L;
	
	private String description;
	private Set<Player> players;
	
	public void addPlayer (PlayerModel player) {
		if(players == null)
			players = new TreeSet<>();
		if(!players.contains(player))
			players.add(player);
		// TODO Auto-generated method stub
		
	}


		


	
	
	
	
}
