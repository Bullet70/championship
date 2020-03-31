package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.esinware.championship.domain.Squadra;
import it.esinware.championship.dto.ChampionshipModel;
import it.esinware.championship.persistence.SquadraRepository;

@SuppressWarnings("unused")
public class SquadraService {
	
	private SquadraRepository repos;
	
	public ChampionshipModel loadSquadra(Long id) {
		ChampionshipModel model = new ChampionshipModel();
		Squadra squadra= repos.getOne(id);
		return model;
	}
}
