package it.esinware.championship.dto;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;


public class PartitaModel implements Serializable{

	private static final long serialVersionUID = 4364972170687145136L;
	
	private String description;
	private SortedSet<PartitaModel> teams;
	
	public void addTeam(PartitaModel team) {
		if(teams == null)
			teams = new TreeSet<>();
		if(!teams.contains(team))
			teams.add(team);
	}

	
	

	
		
	
}
