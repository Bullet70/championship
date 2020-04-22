package it.esinware.championship.domain;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Country {
	@Id
	private Long id;
	private Long countries;
	private String name;
	
	protected Country () {}
	
	 public Country(String name) {
		    this.name = name;
		  }
}



