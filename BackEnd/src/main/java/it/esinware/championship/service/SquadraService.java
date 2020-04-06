package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.championship.domain.Squadra;
import it.esinware.championship.dto.PartitaModel;
import it.esinware.championship.dto.SquadraModel;
import it.esinware.championship.persistence.SquadraRepository;

@Service
public class SquadraService {
	
	@Autowired
	private SquadraRepository repos;
	
	
	public SquadraModel loadSquadra(Long id) {
		SquadraModel model = new SquadraModel();
		Squadra squadra = repos.getOne(id);
		return model;
		model.setDescription(squadra.getName().getName());
		squadra.getPlayers().forEach( players-> {
			SquadraModel playerModel = new SquadraModel();
			player.setPlayer(player.getPlayer());
			model.addPlayer(playerModel);
		});
	}
		
	
	public SquadraModel saveSquadra(Long id){
		SquadraModel model= new SquadraModel();
		Squadra squadra=repos.getOne(id);
		return model;
	}
}
