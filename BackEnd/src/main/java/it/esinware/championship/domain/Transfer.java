package it.esinware.championship.domain;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Data
public class Transfer {
	@Id
	private Long id;
	private Player player;
	private Team fromTeam;
	private Team toTeam;
	@Temporal(TemporalType.DATE)
	private Date transferDate;
}