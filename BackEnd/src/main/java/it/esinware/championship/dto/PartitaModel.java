package it.esinware.championship.dto;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;
import lombok.Data;

@Data
public class PartitaModel implements Serializable{

	private static final long serialVersionUID = 4364972170687145136L;
	
	private String description;
	private SquadraModel homeTeam;
	private SquadraModel guestTeam;
	private SortedSet<PartitaModel> team;
	private SortedSet<PartitaModel>scores;
	
	
	public void addScore(PartitaModel score) {
		if(scores == null)
			scores = new TreeSet<>();
		if(!scores.contains(score))
			scores.add(score);
	}


	
}
