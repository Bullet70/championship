package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.championship.domain.Campionato;
import it.esinware.championship.dto.ChampionshipModel;
import it.esinware.championship.persistence.ChampionshipRepository;

@Service
public class ChampionshipService {

	@Autowired
	private ChampionshipRepository repos;
	
	
	public ChampionshipModel loadCampionato(Long id) {
		ChampionshipModel model = new ChampionshipModel();
		Campionato campionato = repos.getOne(id);
		//TODO Implement mapping from entity to view model
		return model;
	}
	
	public ChampionshipModel removeOne(Long id) {
		ChampionshipModel model= new ChampionshipModel();
		Campionato campionato = repos.deleteById(id);;
	}
	
	
	
	
	
	
}