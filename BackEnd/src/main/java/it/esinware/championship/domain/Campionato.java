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
public class Campionato {
	
	@Id
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date startYear;
	@Temporal(TemporalType.DATE)
	private Date endYear;
	@OneToMany
	@OrderBy("numberRound")
	private SortedSet<Giornata> fixtures;
}