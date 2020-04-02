package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.championship.domain.Giornata;
import it.esinware.championship.dto.ChampionshipModel;
import it.esinware.championship.persistence.GiornataRepository;


@Service
public class GiornataService {
	
	@Autowired
	private GiornataRepository repos;
	
	public ChampionshipModel loadGiornata(Long id) {
		ChampionshipModel model = new ChampionshipModel();
		Giornata giornata= repos.getOne(id);
		return model;
	}

}
