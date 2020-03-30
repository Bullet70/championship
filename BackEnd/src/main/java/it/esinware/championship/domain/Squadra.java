package it.esinware.championship.domain;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Squadra {

	@Id
	private Long id;
	private String name;
	@OneToMany
	private Set<Player> players;
}