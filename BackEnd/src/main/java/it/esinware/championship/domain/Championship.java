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
public class Championship {
	
	@Id
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date startYear;
	@Temporal(TemporalType.DATE)
	private Date endYear;
	@OneToMany
	@OrderBy("numberRound")
	private SortedSet<Round> fixtures;
	
	protected Championship() {}
	
	 public Championship(Date startYear, Date endYear) {
		    this.startYear = startYear;
		    this.endYear = endYear;
		  }
}

