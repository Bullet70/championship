package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.esinware.championship.domain.Player;
import it.esinware.championship.domain.Squadra;
import it.esinware.championship.dto.PlayerModel;
import it.esinware.championship.dto.SquadraModel;
import it.esinware.championship.persistence.SquadraRepository;

@Service
public class SquadraService {
	
	@Autowired
	private SquadraRepository repos;
	
	
	public SquadraModel loadSquadra(Long id) {
		SquadraModel model = new SquadraModel();
		Squadra squadra = repos.getOne(id);
		model.setDescription(squadra.getName());
		squadra.getPlayers().forEach( player -> {
			SquadraModel playerModel = new SquadraModel();
			playerModel.setName(player.getName());
			playerModel.setSurname(player.getSurname());
			playerModel.addAll(player);;
		
		
		});
		
		
		return model;
	}
		
	
	public SquadraModel saveSquadra(Long id){
		SquadraModel model= new SquadraModel();
		Squadra squadra=repos.getOne(id);
		return model;
	}
}
