package it.esinware.championship.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class ScoreModel implements Serializable {
	private static final long serialVersionUID = -931610078925046739L;
	private Integer minute;
}
