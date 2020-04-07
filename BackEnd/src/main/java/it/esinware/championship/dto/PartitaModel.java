package it.esinware.championship.dto;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;
import lombok.Data;

@Data
public class PartitaModel implements Serializable{

	private static final long serialVersionUID = 4364972170687145136L;
	
	private String description;
	private SortedSet<PartitaModel> teams;
	private SortedSet<PartitaModel>scores;
	
	public void addTeam(PartitaModel team) {
		if(teams == null)
			teams = new TreeSet<>();
		if(!teams.contains(team))
			teams.add(team);
	}
	
	public void addScore(PartitaModel score) {
		if(scores == null)
			scores = new TreeSet<>();
		if(!scores.contains(score))
			scores.add(score);
	}


	
	

	
		
	
}
