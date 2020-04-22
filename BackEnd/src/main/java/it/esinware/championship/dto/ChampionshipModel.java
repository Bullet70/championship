package it.esinware.championship.dto;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;
import lombok.Data;

@Data
public class ChampionshipModel implements Serializable {
	private static final long serialVersionUID = 3105807023942359234L;
	private String description;
	private SortedSet<RoundModel> fixtures;

	public void addRound(RoundModel round) {
		if(fixtures == null)
			fixtures = new TreeSet<>();
		if(!fixtures.contains(round))
			fixtures.add(round);
	}
}