package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.esinware.championship.domain.Partita;
import it.esinware.championship.dto.ChampionshipModel;
import it.esinware.championship.persistence.PartitaRepository;
import it.esinware.championship.service.ChampionshipService;



@SuppressWarnings("unused")
public class PartitaService {
	
	private PartitaRepository repos;

	public ChampionshipModel loadPartita(Long id) {
		ChampionshipModel model = new ChampionshipModel();
		Partita partita = repos.getOne(id);
		return model;
		
	}
	

}
