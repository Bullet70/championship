package it.esinware.championship.dto;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;

import it.esinware.championship.domain.Score;
public class PartitaModel implements Serializable{

	private static final long serialVersionUID = 4364972170687145136L;
	
	private String description;
	private Integer game;
	private SortedSet<Score> minute;
	

	public Integer getGame() {
		return game;
	}

	public void setGame(Integer game) {
		this.game = game;
	}

	
		
	public void addScore(PartitaModel score) {
		if( score== null)
		if(!score.contains(score))
			score.add(score);
	}

	
}
