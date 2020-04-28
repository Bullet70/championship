package it.esinware.championship.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import lombok.Data;

@Data
@Entity
public class Team {
	@Id
	private Long id;
	private String name;
	@OneToMany
	@OrderBy("player")
	private List<Player> players;

	protected Team() {}

	public Team(String name) {
		this.name = name;
	}
}