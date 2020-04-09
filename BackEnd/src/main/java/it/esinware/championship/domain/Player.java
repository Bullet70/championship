package it.esinware.championship.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Player {
	
	@Id
	private Long id;
	private String surname;
	private String name;
	
	protected Player () {}
	
	 public Player(String surname, String name) {
		    this.surname = surname;
		    this.name = name;
		  }
	
	
}