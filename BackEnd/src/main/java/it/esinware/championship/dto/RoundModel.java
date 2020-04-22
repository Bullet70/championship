package it.esinware.championship.dto;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;
import it.esinware.championship.domain.Game;
import lombok.Data;

@Data
public class RoundModel  implements Serializable{

	private static final long serialVersionUID = -289375407268378280L;
	
	private int description;
	private Integer roundNumber;
	private Integer game;
	private SortedSet<Game> games;
	
	
	public void addGame(Game game) {
		if(games == null)
			games= new TreeSet<>();
		if(!games.contains(game))
			games.add(game);
	}
}
