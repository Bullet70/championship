package it.esinware.championship.domain;

import java.util.SortedSet;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import lombok.Data;

@Data
@Entity
public class Game {

	@Id
	private Long id;
	@OneToOne
	private Team homeTeam;
	@OneToOne
	private Team guestTeam;
	@OneToMany
	@OrderBy("minute")
	private SortedSet<Score> score;
	private Integer game;
	
	protected Game() {}
	
	 public Game(Team homeTeam, Team guestTeam) {
		    this.homeTeam = homeTeam;
		    this.guestTeam = guestTeam;
		  }
	
}