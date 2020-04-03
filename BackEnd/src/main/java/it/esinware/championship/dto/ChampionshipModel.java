package it.esinware.championship.dto;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;
import lombok.Data;

@Data
public class ChampionshipModel implements Serializable {

	private static final long serialVersionUID = 3105807023942359234L;
	
	private String description;
	private SortedSet<GiornataModel> rounds;
	
	public void addRound(GiornataModel round) {
		if(rounds == null)
			rounds = new TreeSet<>();
		if(!rounds.contains(round))
			rounds.add(round);
	}
}