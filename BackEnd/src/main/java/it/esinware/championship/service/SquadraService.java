package it.esinware.championship.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.esinware.championship.domain.Giornata;
import it.esinware.championship.domain.Squadra;
import it.esinware.championship.dto.SquadraModel;
import it.esinware.championship.persistence.SquadraRepository;

@Service
public class SquadraService {
	
	@Autowired
	private SquadraRepository reposSquadra;
	
	
	public SquadraModel loadSquadra(Long id) {
		SquadraModel model = new SquadraModel();
		Squadra squadra = reposSquadra.getOne(id);
		model.setDescription(squadra.getName());
		squadra.getPlayers().forEach( player -> {
			SquadraModel playerModel = new SquadraModel();
				playerModel.setName(playerModel.getName());
				playerModel.setSurname(playerModel.getSurname());
				model.addPlayer(playerModel);
			});
		
		
		return model;
	}
		
	
	public SquadraModel saveSquadra (Long id){
		SquadraModel model= new SquadraModel();
		Squadra squadra=reposSquadra.getOne(id);
		model.setDescription(squadra.getName());
		squadra.getPlayers().forEach( player -> {
			SquadraModel playerModel = new SquadraModel();
				playerModel.setName(playerModel.getName());
				playerModel.setSurname(playerModel.getSurname());
				model.addPlayer(playerModel);
			});
		return model;
	}
	
	public void deleteSquadra(Long id ) {
		reposSquadra.deleteById(id);
	}
	
	public Optional <Squadra> findByIdSquadra(Long id) {

        return reposSquadra.findById(id);
    }
}
