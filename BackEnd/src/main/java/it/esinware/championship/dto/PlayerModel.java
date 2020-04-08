package it.esinware.championship.dto;

import java.io.Serializable;
import lombok.Data;


@Data
public class PlayerModel implements Serializable {

	private static final long serialVersionUID = 6695132715165614846L;
	
	private Integer name;
	private Integer surname; 

}
