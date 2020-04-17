package it.esinware.championship.domain;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import lombok.Data;

@Data
@Entity
public class Squadra {

	@Id
	private Long id;
	private Long teams;
	private String name;
	@OneToMany
	@OrderBy("player")
	private Set<Player> players;
	
	protected Squadra () {}
	
	 public Squadra(String name) {
		    this.name = name;
		  }
}