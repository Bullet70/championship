package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.championship.domain.Partita;
import it.esinware.championship.dto.ChampionshipModel;
import it.esinware.championship.persistence.PartitaRepository;




@Service
public class PartitaService {
	
	@Autowired
	private PartitaRepository repos;

	public ChampionshipModel loadPartita(Long id) {
		ChampionshipModel model = new ChampionshipModel();
		Partita partita = repos.getOne(id);
		return model;
		
	}
	

}
