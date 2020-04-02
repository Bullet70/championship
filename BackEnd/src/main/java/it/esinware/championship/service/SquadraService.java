package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.championship.domain.Squadra;
import it.esinware.championship.dto.ChampionshipModel;
import it.esinware.championship.persistence.SquadraRepository;

@Service
public class SquadraService {
	
	@Autowired
	private SquadraRepository repos;
	
	public ChampionshipModel loadSquadra(Long id) {
		ChampionshipModel model = new ChampionshipModel();
		Squadra squadra= repos.getOne(id);
		return model;
	}
}
