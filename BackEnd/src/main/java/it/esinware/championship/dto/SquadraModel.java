package it.esinware.championship.dto;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;
import it.esinware.championship.domain.Player;
import lombok.Data;

@Data
public class SquadraModel implements Serializable {

	private static final long serialVersionUID = 6054800629275827590L;
	
	private String description;
	private String Name;
	private String Surname;
	private Set<Player> players;
	
	public void addPlayer (SquadraModel player) {
		if(players == null)
			players = new TreeSet<>();
		if(!players.contains(player))
			players.addAll(getPlayers());
		
	}

	


		


	
	
	
	
}
