package it.esinware.championship.domain;

import java.util.SortedSet;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import lombok.Data;

@Data
@Entity
public class Partita {

	@Id
	private Long id;
	private Squadra homeTeam;
	private Squadra guestTeam;
	@OneToMany
	@OrderBy("minute")
	private SortedSet<Score> score;
	private Integer game;
	
}