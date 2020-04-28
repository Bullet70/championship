package it.esinware.championship.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import it.esinware.championship.enumeration.PlayerRole;
import lombok.Data;

@Data
@Entity
public class Player {
	@Id
	private Long id;
	private String alias;
	private String surname;
	private String name;
	private PlayerRole role;
	@OneToMany
	private List<Transfer> teams;

	protected Player() {}

	public Player(String alias) {
		if(alias == null)
			throw new NullPointerException();
		this.alias = alias;
	}
}