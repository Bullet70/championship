package it.esinware.championship.dto;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;
import lombok.Data;

@Data
public class GameModel implements Serializable {
	private static final long serialVersionUID = 4364972170687145136L;
	private String description;
	private TeamModel homeTeam;
	private TeamModel guestTeam;
	private Integer minute;
	private Integer game;
	private SortedSet<GameModel> scores;

	public void addScore(GameModel score) {
		if(scores == null)
			scores = new TreeSet<>();
		if(!scores.contains(score))
			scores.add(score);
	}
}