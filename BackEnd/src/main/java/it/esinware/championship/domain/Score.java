package it.esinware.championship.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Score {
	
	@Id
	private Long id;
	private Player player;
	private Integer minute;
	private boolean ownGol;
	private boolean gol;
	private boolean yellowCard;
	private boolean redCard;
	private boolean injured;
	
	protected Score () {}
	
	 public Score(Player player, boolean ownGol) {
		    this.player = player;
		    this.ownGol = ownGol;
		  }
}