package it.esinware.championship.domain;

import java.util.Date;
import java.util.SortedSet;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class Round {
	@Id
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date day;
	@OneToMany
	@OrderBy("game")
	private SortedSet<Game> games;
	private Integer numberRound;
	
	protected Round() {}
	
	 public Round(Date day) {
		    this.day = day;
		  }
}