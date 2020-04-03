package it.esinware.championship.dto;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;
import it.esinware.championship.domain.Partita;
import lombok.Data;

@Data
public class GiornataModel  implements Serializable{

	private static final long serialVersionUID = -289375407268378280L;
	
	private int description;
	private Integer roundNumber;
	private SortedSet<Partita> games;
	
	
	public void addGame(Partita game) {
		if(games == null)
			games= new TreeSet<>();
		if(!games.contains(game))
			games.add(game);
	}
}
