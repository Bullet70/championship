package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.championship.domain.Giornata;
import it.esinware.championship.dto.GiornataModel;
import it.esinware.championship.dto.PartitaModel;
import it.esinware.championship.persistence.GiornataRepository;


@Service
public class GiornataService {
	
	@Autowired
	private GiornataRepository repos;
	
	public GiornataModel loadGiornata(Long id) {
		GiornataModel model = new GiornataModel();
		Giornata giornata= repos.getOne(id);
		model.setDescription(giornata.getDay().getDay());
		giornata.getPartita().forEach( game-> {
			PartitaModel gameModel = new PartitaModel();
			game.setGame(game.getGame());
			model.addGame(gameModel);
		});
		return model;
	}
	
	public GiornataModel saveGiornata(Long id){
		GiornataModel model= new GiornataModel();
		Giornata giornata=repos.getOne(id);
		return model;
	}

}
