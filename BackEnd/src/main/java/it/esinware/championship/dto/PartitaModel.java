package it.esinware.championship.dto;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;

import it.esinware.championship.domain.Score;
public class PartitaModel implements Serializable{

	private static final long serialVersionUID = 4364972170687145136L;
	
	private String description;
	private SortedSet<Score> minute;
	
	public void addScore(ScoreModel minute) {
	
	}
		
	
	
}
