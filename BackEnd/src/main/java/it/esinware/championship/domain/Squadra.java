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
	private String name;
	@OneToMany
	@OrderBy("players")
	private Set<Player> players;
}